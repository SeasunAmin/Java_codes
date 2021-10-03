
package javacodes;

import java.util.ArrayList;

public class Array_List_3
{
    public static void main(String[] args) {
        
        ArrayList<Integer>  number1 = new ArrayList<>();
        ArrayList<Integer>  number2= new ArrayList<>(); 
        ArrayList<Integer>  number3 = new ArrayList<>(); 
        
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        number1.add(50);
        System.out.println("Number 1 = "+number1);
        
        number2.add(15);
        number2.add(25);
        number2.add(35);
        number2.add(45);
        number2.add(55);
        System.out.println("Number 2 = "+number2);  
        
        number3.addAll(number1);
        System.out.println("Number 3 = " +number3);
        
        boolean result = number1.equals(number3);
        System.out.println("Reult is : "+result);
        
    }
}
