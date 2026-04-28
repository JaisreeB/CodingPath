import java.util.*;
public class CrossPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    System.out.print(str.charAt(i));
                }
                else if (i + j == n - 1) {
                    System.out.print(str.charAt(j));
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
