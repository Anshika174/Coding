
public class SortednrotatedarraySearch{
 
    public static int search(int []nums,int target,int si,int end){
        
        if(si>end){
            return -1;
        }

        //calculate mid 
        int mid=si+(end-si)/2;
        //found at mid
        if(nums[mid]==target){
               return mid;
        }

        if(nums[si]<=nums[mid])//left sorted
        {
            //case a:left search
            if(nums[si]<=target && target<=nums[mid]){
            return search(nums,target,si,mid-1);
            }
            //case b:right search
            else{
                return search(nums,target,mid+1,end);
            }
        }
        else//right sorted
        {
            // case c:right search
            if(nums[mid]<=target && target<=nums[end]){
                return search(nums,target,mid+1,end);
            }
            //case d:left search
            else{
              return search(nums,target,si,mid-1);         
            }
        }
       
            
    }
    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        int result=search(nums,target,0,nums.length-1);
        System.out.print(result);
        

    }
    
}
