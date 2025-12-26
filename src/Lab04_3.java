import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Lab04_3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Hello Program: Tinnaphat Juecharoen 68160147 n28");
        f.setSize( 500, 300);
        f.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setText("Enter name :");
        f.add(label);

        JTextField nameBox = new JTextField(5);
        f.add(nameBox);

        JLabel label2 = new JLabel();

        JButton b1 = new JButton();
        b1.setText("Send");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = nameBox.getText();
                label2.setText("Hello " + str);
            }
        });
        p1.add(b1);
        p2.add(label2);

        f.add(p1,BorderLayout.CENTER);
        f.add(p2,BorderLayout.SOUTH)

        f.setVisible(true);
    }
}
