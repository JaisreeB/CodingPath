import java.util.*;
public class BalParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean balanced = true;
        for(char c : s.toCharArray()){
            if(c=='('||c=='{'||c=='[') st.push(c);
            else{
                if(st.isEmpty()){
                    balanced = false;
                    break;
                }
                char t = st.pop();
                if((c==')' && t!='(') ||(c=='}' && t!='{')||(c==']' && t!='[')){
                    balanced = false;
                    break;
                }
            }
        }
        if(!st.isEmpty()) balanced=false;
        System.out.println(balanced? "Balanced":"Not Balanced");
        sc.close();
    }
}
