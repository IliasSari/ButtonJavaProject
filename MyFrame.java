import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    JButton button;

    MyFrame(){

        JButton button = new JButton();
        button.setBounds(200, 100, 150, 50);
        button.addActionListener(e -> System.out.println("Hello"));
        button.setText("This is a button");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 14));
        button.setForeground(Color.green);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("Hello");
            button.setEnabled(false);
        }

    }
}
