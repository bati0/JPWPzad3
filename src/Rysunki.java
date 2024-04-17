import java.awt.event.*;
        import java.awt.*;
        import javax.swing.*;
public class Rysunki extends JFrame {
    Rysunki () {
        super ("Rysunki");
        setSize(200, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint (Graphics g) {
        Insets insets = getInsets();
        g.translate (insets.left, insets.top);
        g.drawLine (5, 5, 195, 5);
        g.drawLine (5, 75, 5, 75);
        g.drawRect (25, 10, 50, 75);
        g.fillRect (25, 110, 50, 75);
        g.drawRoundRect (100, 10, 50, 75, 60, 50);
        g.fillRoundRect (100, 110, 50, 75, 60, 50);
        g.setColor(Color.red);
        g.drawString ("Test grafiki",50, 100);
        g.setColor(Color.black);
    }
    public static void main (String [] args) {
        JFrame f = new Rysunki ();
        f.setVisible(true);
    }
}

