package SwingIJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    public static void main(String[] args) {
        Addition obj = new Addition();
    }
}
    class Addition extends JFrame implements ActionListener {
    JTextField j1;
    JTextField j2;

    JButton b1;
    JLabel l1;
    JLabel l2;
        public Addition(){
            j1 = new JTextField(20);
            j2 = new JTextField(20);
            b1 = new JButton("calculator");
            l1 = new JLabel("result");
            l2 = new JLabel("product");
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
            int num1 = Integer.parseInt(j1.getText());
            int num2 = Integer.parseInt(j2.getText());
            int value = num1 + num2;
            int pro = num1 * num2;
            l1.setText(value+" ");
            l2.setText(pro+"");
        }
    }
