
package SwingIJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formula1 {
    public static void main(String[] args) {
        Formula obj = new Formula();
    }
}
class Formula extends JFrame implements ActionListener {
    JTextField j1;
    JTextField j2;

    JButton b1;
    JLabel l1;
    JLabel l2;
    public Formula(){
        j1 = new JTextField(20);
        j2 = new JTextField(20);
        b1 = new JButton("Calculate");
        l1 = new JLabel("(a+b)^2");
        l2 = new JLabel("(a-b)^2");
        add(j1);
        add(j2);
        add(b1);
        add(l1);
        add(l2);
        b1.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        //  setDefaultCloseOperation(3);    FOR EXIT OR CLOSE THE EXECUTION
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(j1.getText());
        int b = Integer.parseInt(j2.getText());
        int value =  a*a + (2*(a*b)) + b*b;
        int value2 = a*a -(2*(a*b)) +b*b;
        // a=2 b=3 --> 4+12+9 = 25
        //                       4-12+9 = 1
        l1.setText(value+" ");
        l2.setText(value2+" ");


    }
}

