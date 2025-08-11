public class Interface {
    public static void main(String args[]){
        Calculator Sum=new Basic_C();
        System.out.println(Sum.add(8,9));
        System.out.println(Sum.subtract(9,4));
        System.out.println(Sum.multiply(2,7));
        System.out.println(Sum.division(90,9));
 

    }
}
interface Calculator{

    public int add(int a,int b);
    public int subtract(int a,int b);
    public int multiply(int a,int b);
    public int division(int a,int b);
}
class Basic_C implements Calculator{
    int a;
    int b;
    
    @Override 
    public int add(int a ,int b){
        return a+b;
    }
    @Override 
    public int subtract(int a ,int b){
        return a-b;
    }
    @Override 
    public int multiply(int a ,int b){
        return a*b;
    }
    @Override 
    public int division(int a ,int b){
        return a/b;
    }
}

