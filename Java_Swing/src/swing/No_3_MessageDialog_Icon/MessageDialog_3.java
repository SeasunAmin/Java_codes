
package swing.No_3_MessageDialog_Icon;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MessageDialog_3
{
    public static void main(String[] args) {
        
        ImageIcon img = new ImageIcon("car.png");
	JOptionPane.showMessageDialog(null,"Enter Correct password.", "Warning",JOptionPane.PLAIN_MESSAGE,img);
    }
}
