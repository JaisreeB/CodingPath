import java.util.*;
class MinSmall{
    int size;
    int stack[];
    int top;
    MinSmall(int size){
        this.size=size;
        stack =new int[size];
        top=-1;
    }
    public void push(int val){
        if(top==size-1){
            System.out.print("Overflow");
        }
        else{
            stack[++top]=val;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.print("Underflow");
        }
        else{
            int c=stack[top--];
            System.out.print(c);
        }
    }
    public void peek(){
        if(top==-1){
            System.out.print("Underflow");
        }
        else{
            System.out.print(stack[top]);
        }
    }
public void min() {

    if(top == -1){
        System.out.println("Empty stack");
        return;
    }
    System.out.print("-1 ");
    for(int i = 1; i <= top; i++) {
        int next = -1;
        for(int j = i-1; j >= 0; j--) {
            if(stack[j] < stack[i]) {
                next = stack[j];
                break;
            }
        }
        System.out.print(next + " ");
    }
    System.out.println();
}
    
public static void main(String[] args){
    Scanner cs =new Scanner(System.in);
    int n=cs.nextInt();
    MinSmall s=new MinSmall(n);
   for(int i=0;i<n;i++){         
                int val=cs.nextInt();
                s.push(val);
               }
               
                s.min();
                
            
}
}
