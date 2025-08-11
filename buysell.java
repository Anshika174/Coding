import java.util.*;
public class buysell {
    public static int max_Profit(int price[]){
        int maxprofit=0;
        int profit=0;
        int buyprice=price[0];
        for(int i=1;i<price.length;i++){
            if(buyprice < price[i]){
                profit = price[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=price[i];
            }
        }
        return maxprofit;
    }
    public static void main (String args[]){
        int []price={7,1,5,3,6,4};
        max_Profit(price);
        System.out.print(max_Profit(price));
        
    }
}
