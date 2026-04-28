import java.util.*;

public class WiggleSubsequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if(n < 2) {
            System.out.println(n);
            return;
        }

        int up = 1, down = 1;

        for(int i = 1; i < n; i++) {
            if(nums[i] > nums[i - 1]) {
                up = down + 1;
            }
            else if(nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }

        System.out.println(Math.max(up, down));
    }
}
