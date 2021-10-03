
package Inheritance;


public class Student_Test extends Student
{
    private int roll;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public static void main(String[] args) {
        Student_Test ob1 = new Student_Test();
        ob1.setname("sessun");
        ob1.setid(1344);
        ob1.setRoll(101);
        
        System.out.println(ob1.getname());
        System.out.println(ob1.getid());
        System.out.println(ob1.getRoll());
        
        
    }
}
