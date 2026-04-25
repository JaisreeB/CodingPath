import java.util.*;
class Rev {
    public String reverseWords(String s) {
        String[] words = s.split(" ");        
        for (int i = 0; i < words.length; i++) {
            char[] wordChars = words[i].toCharArray();
            int left = 0;
            int right = wordChars.length - 1;            
            while (left < right) {
                char temp = wordChars[left];
                wordChars[left++] = wordChars[right];
                wordChars[right--] = temp;
            }            
            words[i] = new String(wordChars);
        }        
        return String.join(" ", words);
    }
}
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        Rev r = new Rev();
        String result = r.reverseWords(input);
        
        System.out.println("Reversed words: " + result);
        
        sc.close();
    }
}
