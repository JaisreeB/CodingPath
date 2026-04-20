import java.util.*;
class ReverseStack{
    int size;
    int arr[];
    int top;
    ReverseS(int size){
        this.size = size;
        arr = new int[size];
        top=-1;
    }
    public void push(int data){
        if(top==size-1) System.out.print("OverFlow");
        arr[++top]=data;
    }
    public void pop(){
        if(top==-1) System.out.print("UnderFlow");
        System.out.print(arr[top--]);
    }
    public void peek(){
        if(top==-1) System.out.print("UnderFlow");
        System.out.print(arr[top]);
    }
    public void reverse(){

       int left = top, right =0;
         while(left>right){
              int temp = arr[left];
              arr[left]=arr[right];
              arr[right]=temp;
              left--;
              right++;
         }
    }
     public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseStack s = new ReverseStack(n);
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            s.push(data);
        }
        s.reverse();
        s.display();
    }
}
