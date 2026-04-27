import java.util.*;

public class LCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        if (strs == null || strs.length == 0) {
            System.out.println("");
            return;
        }

        Arrays.sort(strs);

        String start = strs[0];
        String end = strs[strs.length - 1];

        int i = 0;

        while (i < start.length() && i < end.length()
                && start.charAt(i) == end.charAt(i)) {
            i++;
        }

        System.out.println(start.substring(0, i));
    }
}
