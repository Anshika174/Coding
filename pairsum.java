public class pairsum {
    public static void pairSum(int arr[],int tar){
        int i=0;
        int j=arr.length-1;
        
        while(i<j){
            int ps=arr[i]+arr[j];
            if(ps>tar){
                j--;
            }
            else if(ps<tar){
                j++;
            }
            else{
                System.out.print(i+","+j);
                return;
            }
        }
        System.out.print("no pair found");
        
    }
    public static void main(String args[]){
        int arr[]={2,7,11,15};
        int tar=13;
        pairSum(arr,tar);
        
    }
}
