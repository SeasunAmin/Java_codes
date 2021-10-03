
package OOP;

public class Private  
{
    private String name;
    private int age;
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public static void main(String[] args) {
        
        Private ob = new Private();
        ob.setName("seasun");
        ob.setAge(21);
        System.out.println("Name : "+ob.getName());
        System.out.println("Age : "+ob.getAge());
        
    }
}
