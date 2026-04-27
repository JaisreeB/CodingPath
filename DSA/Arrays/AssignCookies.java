import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int m = sc.nextInt(); 

        int[] g = new int[n]; 
        int[] s = new int[m]; 

        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }

        for (int j = 0; j < m; j++) {
            s[j] = sc.nextInt();
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;

        while (j < s.length && i < g.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }

        System.out.println(i);
    }
}
