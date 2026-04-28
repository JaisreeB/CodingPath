import java.util.*;

public class IncreasingTriplet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        boolean found = false;

        for (int num : nums) {

            if (num <= first) {
                first = num;
            } 
            else if (num <= second) {
                second = num;
            } 
            else {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}
