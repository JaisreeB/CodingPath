import java.util.*;

class WordSearch {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,i,j,0)) return true;
            }
        }
        return false;
    }

    static boolean dfs(char[][] board,String word, int i, int j, int idx){
        if(idx==word.length()) return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length 
           || board[i][j]!=word.charAt(idx)) return false;

        board[i][j]='$';

        boolean found = dfs(board,word,i+1,j,idx+1)
                      || dfs(board,word,i-1,j,idx+1)
                      || dfs(board,word,i,j+1,idx+1)
                      || dfs(board,word,i,j-1,idx+1);

        board[i][j]= word.charAt(idx);

        return found;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        char[][] board = new char[m][n];

        for(int i = 0; i < m; i++){
            String s = sc.next();
            for(int j = 0; j < n; j++){
                board[i][j] = s.charAt(j);
            }
        }

        String word = sc.next();

        WordSearch obj = new WordSearch();
        System.out.println(obj.exist(board, word));
    }
}
