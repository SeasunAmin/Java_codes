
package swing;

import javax.swing.JOptionPane;

public class No_6_Show_ConfirmDialog_1
{
    public static void main(String[] args) {
        
        
        int choice = JOptionPane.showConfirmDialog(null,"Do you wnat to exit?","Exit",JOptionPane.YES_NO_OPTION );
   
     if(choice == JOptionPane.YES_OPTION)
     {
       System.exit(0);
     }
     else
     {
         System.out.println("Thanks Dear...!!");
    }
   
  }
}