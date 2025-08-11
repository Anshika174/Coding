public class Checkrepetitioninarray {
    public static boolean Repetition(int nums[]){
        boolean check=false;
        
        for(int i=0;i<nums.length;i++){
            int currnum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                int othernum=nums[j];
                if(currnum==othernum){
                    return true;
                }
                
            }
        }

        return check;
    
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        Repetition(nums);
        System.out.println(Repetition(nums));
    }
}

