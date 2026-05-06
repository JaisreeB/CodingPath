import java.util.Scanner;

public class Anagram {
    
    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()) return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        int[] freq = new int[26];
        for(char c: a1) freq[c-'a']++;
        for(char c: b1) freq[c-'a']--;
        for(int i:freq){
            if(i!=0) return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
