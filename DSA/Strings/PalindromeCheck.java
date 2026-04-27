import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String w = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String s1 = "";

        for (int i = w.length() - 1; i >= 0; i--) {
            s1 += w.charAt(i);
        }

        if (s1.equals(w)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
