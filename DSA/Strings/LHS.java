import java.util.*;

public class LHS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int length = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            while (nums[right] - nums[left] > 1) {
                left++;
            }

            if (nums[right] - nums[left] == 1) {
                length = Math.max(length, right - left + 1);
            }
        }

        System.out.println(length);
    }
}
