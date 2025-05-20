package LECTURE.No8.ex07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public
    class MyInteractionPanel
    extends JPanel {

    private JButton jButton;

    public MyInteractionPanel(){
        this.jButton = new JButton("here");

        this.jButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    setBackground(
                        new Color(
                            (int)(Math.random()*255),
                            (int)(Math.random()*255),
                            (int)(Math.random()*255)
                        )
                    );
                }
            }
        );

        this.add(this.jButton);
    }

}
