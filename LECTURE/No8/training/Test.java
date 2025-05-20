package LECTURE.No8.training;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
//        try {
//            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
//                if ("Metal".equals(info.getClassName())){
//                    UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        JFrame frame = new JFrame("title");
        frame.setSize(600, 600);
        JPanel panel = new JPanel(new FlowLayout());
        panel.setSize(500, 500);
        for (int i = 0; i < 5; i++) {
            JButton button = new JButton("Button" + i);
            button.setBackground(Color.BLACK);
            button.setFont(new Font("Arial", Font.PLAIN, 40));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button");
                    panel.setBackground(new Color(
                            (int) (Math.random()*255),
                            (int) (Math.random()*255),
                            (int) (Math.random()*255)
                    ));
                    button.setForeground(new Color(
                            (int) (Math.random()*255),
                            (int) (Math.random()*255),
                            (int) (Math.random()*255)
                    ));
                    button.setBackground(new Color(
                            (int) (Math.random()*255),
                            (int) (Math.random()*255),
                            (int) (Math.random()*255)
                    ));
                }
            });
            panel.add(button);

        }
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        SwingUtilities.invokeLater(
                () -> frame.setVisible(true)
        );
    }
}
