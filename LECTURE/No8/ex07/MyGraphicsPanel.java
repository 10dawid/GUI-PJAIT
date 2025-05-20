package LECTURE.No8.ex07;

import javax.swing.*;
import java.awt.*;

public
    class MyGraphicsPanel
    extends JPanel {

    public MyGraphicsPanel(){
        this.setBackground(Color.CYAN);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillOval( 100, 50, getWidth()/10, getHeight()/10);
    }
}
