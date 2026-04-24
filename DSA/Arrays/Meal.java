/*2. Andrew likes meatballs very much.
He has N plates of meatballs, here the ith plate contains Pi meatballs. You need to find the minimal number of plates Andrew needs to take to his trip to Las Vegas, if he wants to eat there at least M meatballs. Note that each plate is already packed, i.e. he cannot change the amount of meatballs on any plate.
Input
The first line of each test case contains two space-separated integers N and M. The second line contains N space-separated integers P1, P2, ..., PN.
Output
For each test case, output an integer, denoting the minimum number of plates. If it's impossible to take at least M meatballs, print -1.
Sample 1:
Input
4 7
1 2 3 4
Output
2
Explanation:
If he takes 3rd and 4th plates, then we may eat P3 + P4 = 7 meatballs in Las Vegas. This is the only way for eating at least M = 7 meatballs with 2 plates.
*/

import java.util.*;

class Meal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        for(int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        int sum = 0;
        int count = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];
            count++;

            if(sum >= m) {
                System.out.println(count);
                return;
            }
        }

        System.out.println(-1);
    }
}
