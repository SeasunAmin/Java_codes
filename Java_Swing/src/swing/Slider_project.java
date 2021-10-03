
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import sun.font.TextLabel;
import javax.swing.event.ChangeListener;


public class Slider_project extends JFrame implements ChangeListener
{
    private Container c;
    private JSlider s1,s2,s3;
    private JTextField tx1,tx2,tx3;
    private JPanel panel;
    private JLabel label,r,g,b;
    private Font f;
    private Cursor cur;
    Slider_project()
    {
        room();
    }
    
    public void room()
    {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(350,200,1000,500);
        this.setTitle("seasun");
        
        c = this.getContentPane();
        c.setLayout(null);
        
        r = new JLabel("RED");
        r.setBounds(25,98,100,60);
        c.add(r);
        
        r = new JLabel("GREEN");
        r.setBounds(25,198,100,60);
        c.add(r);
        
        r = new JLabel("BLUE");
        r.setBounds(25,298,100,60);
        c.add(r);
        
        cur = new Cursor(Cursor.HAND_CURSOR);
        
        s1 = new JSlider(0,255,0);
        s1.setBounds(80,100,250,60);
        s1.setCursor(cur);
        c.add(s1);
        
        s2 = new JSlider(0,255,0);
        s2.setBounds(80,200,250,60);
        s2.setCursor(cur);
        c.add(s2);
        
        s3 = new JSlider(0,255,0);
        s3.setBounds(80,300,250,60);
        s3.setCursor(cur);
        c.add(s3);
        
        tx1 = new JTextField();
        tx1.setBounds(380,95,90,60);
        c.add(tx1);
        
        tx2 = new JTextField();
        tx2.setBounds(380,195,90,60);
        c.add(tx2);
        
        tx3 = new JTextField();
        tx3.setBounds(380,295,90,60);
        c.add(tx3);
        
        panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setBounds(550,85,400,300);
        c.add(panel);
        
        f = new Font("Cambria Math",Font.BOLD,18);
        label = new JLabel("preview");
        label.setBounds(720,380,100,70);
        label.setFont(f);
        c.add(label);
        
        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);
        
    }
    
     @Override
    public void stateChanged(ChangeEvent ce)
    {
        int redValue = s1.getValue();
        int greenValue = s2.getValue();
        int blueValue = s3.getValue();
        
        tx1.setText(""+redValue);
        tx1.setFont(f);
        tx1.setHorizontalAlignment(JTextField.CENTER);
        
        
        tx2.setText(""+greenValue);
        tx2.setFont(f);
        tx2.setHorizontalAlignment(JTextField.CENTER);
        
        tx3.setText(""+blueValue);
        tx3.setFont(f);
        tx3.setHorizontalAlignment(JTextField.CENTER);
        
        Color color = new Color(redValue,greenValue,blueValue);
        panel.setBackground(color);
    }
    
    
    public static void main(String[] args) {
        
        Slider_project frame = new Slider_project();
        frame.setVisible(true);
    }

   
}
