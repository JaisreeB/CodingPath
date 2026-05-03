import java.util.*;

public class CountPartitionWithEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int result;
        if (total % 2 != 0) {
            result = 0;
        } else {
            result = n - 1;
        }
        System.out.println(result);
    }
}
