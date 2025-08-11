public class GetSet{
    public static void main(String args[]){
      Student stu1 = new Student();
      stu1.setName("Anshika");
      System.out.println(stu1.getName());
      stu1.setRollnumber(1);
      System.out.println(stu1.getRollnumber());
      stu1.setGrade("A");
      System.out.println(stu1.getGrade());

    }
}
    class Student{
      private String name;
      private int rollnumber;
      private String grade;
       
      public String getName(){
        return name;
      }
      public void setName(String nm){
        this.name=nm;
      }
      public int getRollnumber(){
        return rollnumber;
      }
      public void setRollnumber(int rn){
        this.rollnumber=rn;
      }
      public String getGrade(){
        return grade;
      }
      public void setGrade(String grd){
        this.grade=grd;
      }
    }