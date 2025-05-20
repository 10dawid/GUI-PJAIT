package LECTURE.No8.ex05;

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

        this.getContentPane().add(jp, BorderLayout.CENTER);

        String[] loc = {
            BorderLayout.PAGE_START,
            BorderLayout.PAGE_END,
            BorderLayout.LINE_START,
            BorderLayout.LINE_END
        };

        for(String s : loc){
            JPanel jpTmp = new JPanel();
            jpTmp.setBackground(
                new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)
                )
            );
            this.getContentPane().add(jpTmp, s);
        }

        SwingUtilities.invokeLater(
            () -> setVisible(true)
        );
    }
}
