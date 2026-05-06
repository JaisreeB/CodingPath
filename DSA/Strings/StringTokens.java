import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] word = s.split("[^a-zA-Z]+");

        int count = 0;
        for (String w : word) {
            if (!w.isEmpty()) count++;
        }

        System.out.println(count);

        for (String w : word) {
            if (!w.isEmpty()) {
                System.out.println(w);
            }
        }

        scan.close();
    }
}
