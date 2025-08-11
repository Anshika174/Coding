import java.util.*;
public class FirstNonRepeatingLetter_Stream{
    public static void Non_RepeatingLetter(String str){
    int []freq=new int[26];
    Queue<Character> q=new LinkedList<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        q.add(ch);
        freq[ch-'a']++;
        if(!q.isEmpty()){
        while(!q.isEmpty() && freq[q.peek()-'a']>1){
            q.remove();
        }
        if(q.isEmpty()){
            System.out.print(-1+" ");
        }
        else{
            System.out.print(q.peek()+" ");
        }
        }
    }
    
    }
    public static void main(String args[]){
        String str="abaabcx";
        Non_RepeatingLetter(str);
    }
}