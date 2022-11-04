package SwingIJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateSquareAndCube {
    public static void main(String[] args) {
        Square obj = new Square();
    }
}
class Square extends JFrame implements ActionListener {
    JTextField j1;

    JButton b1;
    JLabel l1;
    JLabel l2;
    public Square(){
        j1 = new JTextField(20);
        b1 = new JButton("Calculate");
        l1 = new JLabel("Square");
        l2 = new JLabel("Cube");
        add(j1);
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
        int value = num1 *num1;
        int pro = num1 * num1*num1;
        l1.setText(value+" ");
        l2.setText(pro+"");
    }
}
