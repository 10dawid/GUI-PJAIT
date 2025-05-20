package LECTURE.No8.ex07;

import javax.swing.*;
import java.awt.*;

public
    class MyExamplePanel
    extends JPanel {

    @Override
    public Dimension getPreferredSize() {
        Dimension d = super.getPreferredSize();
        Dimension tmp = new Dimension( 100, (int)d.getHeight());
        return tmp;
    }
}
