import java.util.*;
public class ReverseStack {
    public static void pushToBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushToBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushToBottom(s,top);

    }
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            int top=s.pop();
            System.out.println(top);

        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        reverseStack(s);
        print(s);
        


    }
}
