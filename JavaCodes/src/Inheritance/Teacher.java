
package Inheritance;

public class Teacher extends Person
{
 String sub;
        void display2()
        {
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Subject : "+sub);
        }
        public static void main(String[] args)
        {
        Teacher t = new Teacher();
        t.name = "Seasun";
        t.age = 22;
        t.sub = "CSE";
        t.display2();
    }   
}
