import java.util.*;
public class NextGreaterElement {
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        
        //Solution
        //arr[s.peek()] -> element oin array on the index stored at top of stack
        for(int i=arr.length-1;i>=0;i--){
        //for loop from right to left
        //1.while loop -for finding the greter element
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
        }
        //2.if else
        if(s.isEmpty()){
        nextGreater[i]=-1;
        }
        else{
            nextGreater[i]=arr[s.peek()];
        }
        //3.push the index of element 
        s.push(i);
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(nextGreater[i]+",");
        }
        System.out.println();
        //nextGreater Right
        //nextGreater Left 
        //nextSmaller right
        //nextSmaller left
    }
}
