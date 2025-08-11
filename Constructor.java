public class Constructor {
    public static void main(String args[]){
    Student stu1 = new Student();
    Student stu2 = new Student(102,"Aashi",450);
    Student stu3= new Student(stu2);

    System.out.println("Student 1: id: "+stu1.id+" ,name: "+
    stu1.name+" ,marks: "+stu1.marks);
    System.out.println("Student 2: id :"+stu2.id+" ,name: "+
    stu2.name+", marks: "+stu2.marks);
    System.out.println("Student 3: id: "+stu3.id+" ,name: "+
    stu3.name+" ,marks: "+stu3.marks);

    }
   

}
class Student{
    int id;
    String name;
    double marks;

    Student(){
        id=0;
        name="Unknown";
        marks=0.0;
    }
    Student(int id,String name, double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    Student(Student stu3){
    this.id=stu3.id;
    this.name=stu3.name;
    this.marks=stu3.marks;

    }
}
