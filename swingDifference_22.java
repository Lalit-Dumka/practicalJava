package practicalJava;

import javax.swing.*;
import java.awt.event.*;

public class swingDifference_22 extends JFrame{

    public swingDifference_22(){
        super.setTitle("A-B");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        JTextField t1 = new JTextField();
        t1.setBounds(50, 50, 100, 50);
        add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(50, 100, 100, 50);
        add(t2);

        JButton b1 = new JButton("A - B");
        b1.setBounds(50, 150, 100, 50);
        add(b1);

        JLabel l1 = new JLabel("A - B =");
        l1.setBounds(50, 200, 100, 50);
        add(l1);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                l1.setText("A - B = " + c);
            }
        });

    }
    public static void main(String[] args) {
        new swingDifference_22();
    }
}
