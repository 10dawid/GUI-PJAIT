package GUI_9.zadanie20;

import javax.swing.*;
import java.awt.*;

public class Zadanie20 {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Użycie java Zadanie20.java <fontName> <fontStyle> <fontSize>");
            System.exit(1);
        }
        else {
            new Zadanie20(
                    args[0],
                    args[1].toUpperCase(),
                    Integer.parseInt(args[2])
            );
        }
    }

    public Zadanie20(String fontName, String fontStyle, int fontSize) {
        SwingUtilities.invokeLater(
                () -> createGui(fontName, fontStyle, fontSize)
        );
    }

    protected void createGui(String fontName, String fontStyle, int fontSize){
        JFrame jf = new JFrame("Zadanie 20");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500,500);

        JPanel jp = new JPanel();

        JTextArea textArea = new JTextArea("input text", 100, 100);

        int fontStyleInt = switch (fontStyle){
            case "PLAIN" -> Font.PLAIN;
            case "BOLD" -> Font.BOLD;
            case "ITALIC" -> Font.ITALIC;
            default -> Font.PLAIN;
        };

        textArea.setFont(new Font(fontName, fontStyleInt, fontSize));
//        textArea.setForeground(Color.RED);

        Color selectedColor = JColorChooser.showDialog(jf, "wybierz kolor tekstu", Color.BLACK);
        if (selectedColor != null)
            textArea.setForeground(selectedColor);


        jf.add(jp);
        jp.add(textArea);

        jf.pack();
        jf.setVisible(true);
    }
}
