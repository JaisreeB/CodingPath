/*You are given an integer n representing the number of items, an integer cap representing the total capacity (budget), and an array arr[] of size n where each element denotes the cost of an item.
Determine the maximum number of items you can purchase such that the total cost does not exceed the given capacity cap.*/

import java.util.*;

public class BottleCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cap = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        for(int i = 0; i < n; i++){
            if(cap < arr[i]) break;
            cap -= arr[i];
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
