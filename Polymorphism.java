import java.util.*;
public class Polymorphism {
    public static void main(String args[]){
        Shape rect=new Rectangle();
        rect.Area(3.0,4.0);
        Shape circle=new Circle();
        circle.Area(4.5);
       
    }
    
}
class Shape{
    public void Area(double...dimensions){
        System.out.println();
    }
}
class Rectangle extends Shape{
    @Override public void Area(double...dimensions){
        if(dimensions.length==2){
            double l=dimensions[0];
            double b=dimensions[1];
            System.out.println(l*b);
        }
        
    }
}
class Circle extends Shape{
    @Override public void Area(double...dimensions){
        if(dimensions.length==1){
            double r=dimensions[0];
            System.out.println(Math.PI*r*r);
        }
    }
}
