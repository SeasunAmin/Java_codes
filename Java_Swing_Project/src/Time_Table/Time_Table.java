 package time_table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Time_Table extends JFrame {

    private Container c;
    private JLabel imglabel, label;
    private JTextArea tx;
    private JTextField tf;
    private JButton clearButton;
    private ImageIcon img,icon;
    private Font f;
    private Cursor cursor;

    Time_Table()
    {
        room();
    }

    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 50, 700, 899);
        this.setTitle("SEASUN's Multiplication Table");

        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);

        img = new ImageIcon(getClass().getResource("photo2.jpg"));
        imglabel = new JLabel(img);
        imglabel.setBounds(120, 30, img.getIconWidth(), img.getIconHeight());
        c.add(imglabel);
        
        icon = new ImageIcon(getClass().getResource("smile.png"));
        this.setIconImage(icon.getImage());
        
        label = new JLabel();
        label.setText("Enter any number : ");
        label.setBounds(30, 250, 500, 200);
        f = new Font("Cambria Math", Font.BOLD, 25);
        label.setFont(f);
        c.add(label);

        tf = new JTextField();
        tf.setBounds(280, 317, 120, 70);
        tf.setFont(f);
        tf.setBackground(Color.yellow);
        tf.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(450, 317, 120, 70);
        clearButton.setCursor(cursor);
        clearButton.setFont(f);
        c.add(clearButton);

        tx = new JTextArea();
        tx.setBounds(90, 450, 500, 350);
        tx.setBackground(Color.cyan);
        tx.setFont(f);
        c.add(tx);

        tf.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String value = tf.getText();

                if (value.isEmpty() ) 
                {
                    JOptionPane.showMessageDialog(null, "You did not enter any number.");
                }
                
                else if(value.equals('a'<='z'))
                {
                    JOptionPane.showMessageDialog(null, "You did not enter any number.");
                }
                    
                else 
                {
                    int num = Integer.parseInt(tf.getText());

                    tx.setText("");
                    tx.append("\n");
                    for (int i = 1; i <= 10; i++)
                    {
                        int result = num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String incre = String.valueOf(i);
                        tx.append("\t" + n + " X " + i + " = " + r + "\n");

                    }

                }

            }

        });

        clearButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                tx.setText("");
                tf.setText("");
            }

        });

    }

    public static void main(String[] args) {

        Time_Table frame = new Time_Table();
        frame.setVisible(true);
        frame.setResizable(false);

    }
}
