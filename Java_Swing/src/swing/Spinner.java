
package swing;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Spinner extends JFrame implements ChangeListener
{
    private Container c;
    private JSpinner spin;
    private Font f;
    private JLabel label;
    Spinner()
    {
        room();
    }
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,150,600,500);
        this.setTitle("seasun");
        
        c  = this.getContentPane();
        c.setLayout(null);
        
        f = new Font("Cambria Math",Font.BOLD,20); 
      
       
        SpinnerNumberModel value = new SpinnerNumberModel(0,0,30,1);
        
        spin = new JSpinner(value);
        spin.setBounds(80,70,100,90);
        spin.setFont(f);
        
        c.add(spin);
        
        label = new JLabel();
        label.setBounds(250,79,200,100);
        c.add(label);
        
        spin.addChangeListener(this);
        
    }
    
    @Override
    public void stateChanged(ChangeEvent ce) 
    {
        String number  = spin.getValue().toString();
        int num = Integer.parseInt(number);
        label.setFont(f);
        label.setText("Current value : "+num);


    }
    
    public static void main(String[] args)
    {
     
      Spinner frame = new Spinner();
      frame.setVisible(true)
              ;
    }

    
}
