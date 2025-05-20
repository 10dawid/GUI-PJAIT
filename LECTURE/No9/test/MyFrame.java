package LECTURE.No9.test;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new MyFrame(); //window
    }

    public MyFrame() {
        setTitle("my JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Test ObslugaMyszy i MojPanel");
        setSize(600, 600);


        MojPanel mojPanel = new MojPanel("moj nowy panel");
        mojPanel.setLayout(new BorderLayout(15, 15));


        this.getContentPane().add(mojPanel, BorderLayout.CENTER);

        SwingUtilities.invokeLater(
                () -> setVisible(true)
        );

    }
}
