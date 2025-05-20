package LECTURE.No9.test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ObslugaMyszy implements MouseListener, MouseMotionListener {

    private MojPanel mojPanel;

    public ObslugaMyszy(MojPanel mojPanel) {
        this.mojPanel = mojPanel;
    }

    //MouseListener methods
     @Override
     public void mouseClicked(MouseEvent e) {
         int button = e.getButton();
         String tekst;
         switch (button){
             case MouseEvent.BUTTON1 -> tekst = "btn 1";
             case MouseEvent.BUTTON2 -> tekst = "btn 2";
             case MouseEvent.BUTTON3 -> tekst = "btn 3";
             default -> tekst = "unknown btn";
         }
         tekst += " x = " + e.getX() + " y = " + e.getY();
         System.out.println(tekst);
         mojPanel.setTekst(tekst);
         mojPanel.repaint();
     }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }




    //MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
