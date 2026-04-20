import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Postfixeval{
    Node top;
    public void push(int data){
        Node newnode = new Node(data);
        if(top==null) top = newnode;
        else{
            newnode.next = top;
            top = newnode;
        }
    }
    public int pop(){
        int data = top.data;
        top=top.next;
        return data;
    }
    public void peek(){
        System.out.println(top.data);
    }
    
   
    public int Calculate(int b,int a,String s){
        if(s.equals("+")) return a+b;
        else if(s.equals("-")) return a-b;
        else if(s.equals("*")) return a*b;
        else if(s.equals("/")) return a/b;
        else if(s.equals("^")) return (int)Math.pow(a,b);
        return 0;
    }
    public int evaluation(String str){
        int res=0;
        String[] i = str.split(" ");
        for(String s:i){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")) {
                int a = pop();
                int b = pop();
                int re = Calculate(b,a,s);
                push(re);
            }
            else{
                push(Integer.parseInt(s));
            }
        }
        return pop();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Postfixeval st = new Postfixeval();
        String str = sc.nextLine();
        System.out.println(st.evaluation(str));
    }
}

