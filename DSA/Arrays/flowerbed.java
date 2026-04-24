import java.util.*;
class flowerbed{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] flowerbed = new int[n];
        for(int i=0;i<n;i++){
            flowerbed[i]=sc.nextInt();
        }
        int a = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(flowerbed[i]==0){
                boolean Left = flowerbed[i-1]==0;
                boolean Right = flowerbed[i+1]==0;
                if(Left && Right){
                    flowerbed[i]=1;
                    count++;
                }
            }
        }
        if(count==a){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
       
    }
}
