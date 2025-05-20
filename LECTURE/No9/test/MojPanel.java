package LECTURE.No9.test;

import lombok.Setter;

import javax.swing.*;
import java.awt.*;

public class MojPanel extends JComponent {
    @Setter
    private String tekst;


    private ObslugaMyszy obslugaMyszy;

    public MojPanel(String tekst) {
        this.tekst = tekst;
        setPreferredSize(new Dimension(400, 400));
        obslugaMyszy = new ObslugaMyszy(this);
        addMouseListener(obslugaMyszy);
        addMouseMotionListener(obslugaMyszy);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.drawString(tekst, 20, 20);
    }
}
