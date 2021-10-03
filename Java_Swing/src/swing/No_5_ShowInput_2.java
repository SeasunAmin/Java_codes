
package swing;

import javax.swing.JOptionPane;

public class No_5_ShowInput_2
{
    public static void main(String[] args) {
        
        String f_name = JOptionPane.showInputDialog(null,"Enter your first name : ","This is my world",JOptionPane.QUESTION_MESSAGE);
       String l_name = JOptionPane.showInputDialog(null,"Enter your last name : ","This is my world",JOptionPane.QUESTION_MESSAGE);
       String name = f_name + " " +l_name;
       
       JOptionPane.showMessageDialog(null,"your full name is " +name);
    }
   
}
