import java.util.*;
public class trappedrainwater {
    public static int trapped_rainwater(int []ht){
        int n=ht.length;
        if (n == 0) {
            return 0; // No bars, no water trapped
        }
        int maxLeft[]=new int[n];
        maxLeft[0]=ht[0];

        for(int i=1;i<n;i++){
           maxLeft[i]=Math.max(maxLeft[i-1],ht[i]);
        }  
        int maxRight[]=new int[n];
        maxRight[n-1]=ht[n-1];

        for(int i=n-2;i>=0   ;i--){
           maxRight[i]=Math.max(maxRight[i+1],ht[i]);
        }
        int trapped_water=0;
            for(int i=0;i<n;i++){
            int waterlevel=Math.min(maxLeft[i],maxRight[i]);
            trapped_water += waterlevel - ht[i];
            }
            return trapped_water;
    }
    public static void main(String args[]){
        int ht[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        trapped_rainwater(ht);
        System.out.print(trapped_rainwater(ht));
    }
}

