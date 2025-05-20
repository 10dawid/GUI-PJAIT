package LECTURE.No8.ex03;

import javax.swing.*;

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

        SwingUtilities.invokeLater(
                () -> setVisible(true)
        );
    }
}
