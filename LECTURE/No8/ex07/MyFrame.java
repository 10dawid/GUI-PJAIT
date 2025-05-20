package LECTURE.No8.ex07;

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

        this.getContentPane().add(jp, BorderLayout.PAGE_START);

        JPanel gp = new MyGraphicsPanel();
        this.getContentPane().add(gp, BorderLayout.CENTER);

        JPanel ip = new MyInteractionPanel();
        this.getContentPane().add(ip, BorderLayout.LINE_END);

        JPanel ep = new MyExamplePanel();
        this.getContentPane().add(ep, BorderLayout.LINE_START);

        SwingUtilities.invokeLater(
                () -> setVisible(true)
        );
    }
}
