package SwingIJava;

import javax.swing.*;
import java.awt.*;

public class FirstGui {
    public static void main(String[] args) {
        ABC obj= new ABC();
    }

}
class ABC extends JFrame{
    public ABC(){
        JLabel l = new JLabel("Seing GUL");
        JLabel e = new JLabel("Seing demo");
        add(e);
        add(e);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        //  setDefaultCloseOperation(3);    FOR EXIT OR CLOSE THE EXECUTION
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     /*
      select the code
      go to code
      select save as live template
      save with some name
      apply
      */

    }
}
