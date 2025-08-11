public class largeststring {
    public static String largestString(String []fruit){
       String largest=fruit[0];
       for(int i=1;i<fruit.length;i++){
        if(largest.compareTo(fruit[i])<0){
            largest=fruit[i];
        }
       }
       return largest;
    }
    public static void main(String args[]){
        String []fruit={"apple","mango","banana"};
        largestString(fruit);
        System.out.print(largestString(fruit));

        
    }
}
