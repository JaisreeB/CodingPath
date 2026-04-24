import java.util.*;
public class fractional_knapsack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] obj = new int[n];
        for(int i=0;i<n;i++) obj[i] = sc.nextInt();
        int[] profit = new int[n];
        for(int i=0;i<n;i++) profit[i] = sc.nextInt();
        int[] weight = new int[n];
        for(int i=0;i<n;i++) weight[i] = sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if((profit[i]/weight[i]) < (profit[j]/weight[j])) {
                    int temp1 = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp1;
                    int temp2 = weight[i];
                    weight[i] = weight[j];
                    weight[j] = temp2;
                }
            }
        }
        int maxProfit = 0;
        for(int i=0;i<n;i++) {
            if(w-weight[i] >= 0) {
                maxProfit += profit[i];
                w -= weight[i];
            } else {
                maxProfit += (w/weight[i]) * profit[i];
               
            }
        }
        sc.close();
        System.out.print(maxProfit);
    }
}
