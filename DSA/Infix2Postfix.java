import java.util.*;
class Node{
    char data;
    Node next;
    Node(char data){
        this.data = data;
        this.next = null;
    }
}
class Infix2Postfix{
    Node top;
    public void push(char data){
        Node newnode = new Node(data);
        if(top==null) top = newnode;
        else{
            newnode.next = top;
            top = newnode;
        }
    }
    public char pop(){
        char data = top.data;
        top=top.next;
        return data;
    }
    public void peek(){
        System.out.println(top.data);
    }
    public int precedence (char c){
        if(c=='+' || c=='-') return 1;
        else if(c=='*' || c=='/') return 2;
        else if(c=='^') return 3;
        else if(c=='(') return 0;
        else return -1;
    }
    public String infixpostfix(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(') push(ch);
            else if (ch==')'){
                while(top!=null && top.data!='('){
                    res+=pop();
                }
                pop();
            }
            else if(Character.isLetterOrDigit(ch)) res+=ch;
            else{
                while(top!=null&&precedence(ch)<=precedence(top.data)){
                    res+=pop();
                }
                push(ch);
            }
        }
        while(top!=null){            
            res+=pop();
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Infix2Postfix s = new Infix2Postfix();
        String str = sc.nextLine();
        System.out.println(s.infixpostfix(str));
    }
}
