import java.util.*;
public class DuplicateParentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //Close
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                //duplicate
                if(count<1){
                    return true;
                }
                //not duplicate
                else{
                    s.pop();
                }
                
            }
            //Opening
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        //Valid Parentheses
        String str="(((a+b)+c))";
        System.out.print(isDuplicate(str));
    }
}
