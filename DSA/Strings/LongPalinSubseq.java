import java.util.*;

public class LongPalinSubseq {

    public static int solve(String s, int i, int j) {
        if(i > j) return 0;
        if(i == j) return 1;

        if(s.charAt(i) == s.charAt(j)) {
            return 2 + solve(s, i + 1, j - 1);
        }

        return Math.max(
            solve(s, i + 1, j),
            solve(s, i, j - 1)
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int result = solve(s, 0, s.length() - 1);
        System.out.println(result);
    }
}
