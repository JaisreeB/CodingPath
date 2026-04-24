import java.util.*;
class frequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int visited = -1;
        for(int i=0;i<n;i++){
            if(arr[i]!=-1){
                int count=1;
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        arr[j]=visited;
                    }
                }
                System.out.println(arr[i]+"---"+count);
            }
        }
    }
}
