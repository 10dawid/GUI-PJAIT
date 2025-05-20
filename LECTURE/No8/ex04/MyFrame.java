package LECTURE.No8.ex04;

import javax.swing.*;
import java.awt.*;

public
    class MyFrame
    extends JFrame {

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }

    public MyFrame(){
        this.setTitle("MyFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize( 640, 480);

        JPanel jp = new JPanel();
        jp.setSize(100, 100);
        jp.setLocation( 100, 100);
        jp.setBackground(Color.PINK);

        this.setLayout(null);
        this.getContentPane().add(jp);

        SwingUtilities.invokeLater(
                () -> setVisible(true)
        );
    }
}
