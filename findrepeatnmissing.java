import java.util.HashSet;

public class findrepeatnmissing {
     
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        HashSet <Integer> set=new HashSet<>();
        int a=0,b=0;
        int expSum=0,actualSum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=grid[i][j];
                actualSum+=num;
                if(!set.add(num)){
                a=num;
                
            }

        }
        expSum=(n*n)*(n*n+1)/2;
        b=expSum+a-actualSum;
        
        }
        return new int[]{a,b};
    }
}

