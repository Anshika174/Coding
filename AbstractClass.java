public class AbstractClass {
    public static void main(String args[]){
    Rectangle R1=new Rectangle(4,6.5);
    R1.display();
    Circle C1=new Circle(4.6);
    C1.display();
    }
}
abstract class Shape{
    public abstract double area();
    
    public void display(){
        System.out.println("Area: "+area());
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double area(){
        return length*width;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override 
    public double area(){
        return Math.PI*radius*radius;
    }
}
    
    

