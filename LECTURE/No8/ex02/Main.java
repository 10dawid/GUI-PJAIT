package LECTURE.No8.ex02;

import javax.swing.*;

public
    class Main {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("MyFrame");

        jFrame.setSize( 640, 480);

        SwingUtilities.invokeLater(
            () -> jFrame.setVisible(true)
        );
    }
}
