/* Count the number of inversions in an array.
What is an Inversion?
An inversion is a pair of indices (i, j) such that:
i < j
arr[i] > arr[j]

In simple words:
You are counting how many pairs are out of order.

Example
Input:
n = 5  
arr = [2, 4, 1, 3, 5]

Inversions:
(2, 1)
(4, 1)
(4, 3)

Output:
3*/
import java.util.*;
class Inv{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int inv=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j] && i<j){
                    inv++;
                   }
                }
                }
                System.out.print(inv);
            }
         
        }
        
    

