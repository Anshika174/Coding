import java.util.*;
public class MaxAreaHistogram {
    public static void Max_Area_Histogram(int arr[]){
        int maxArea=0;
        
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        //NextSmallerRight
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();

            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(arr[i]);
        }

        //NextSmallerLeft
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(arr[i]);
        }
        //Current Area
        for(int i=0;i<arr.length;i++){
            int ht=arr[i];
            int wd=nsr[i]-nsl[i]-1;
            int area=ht*wd;
            maxArea=Math.max(maxArea,area);
        }
        System.out.println("Max Area of Histogram is "+maxArea);
    }
    public static void main(String args[]){
        int []arr={2,1,5,6,2,3};
        Max_Area_Histogram(arr);
    }
}
