import javax.swing.*;
import java.awt.geom.*;
import java.awt.*;
public class Rysunki2 extends JFrame {
    Rysunki2 () {
        super ("Rysunki2");
        setSize(200, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint (Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Insets insets = getInsets();
        g2.translate (insets.left, insets.top);
        Line2D linia = new Line2D.Float(20.0f, 20.0f, 180.0f, 20.0f);
        g2.draw(linia);
        BasicStroke grubaLinia = new BasicStroke(6.0f);
        g2.setStroke(grubaLinia);
        g2.setColor(Color.red);
        Line2D linia2 = new Line2D.Float(20.0f, 180.0f, 180.0f, 180.0f);
        g2.draw(linia2);
        g2.drawString ("Test grafiki",50, 100);
        g2.setColor(Color.black);
    }
    public static void main (String [] args) {
        Frame f = new Rysunki2 ();
        f.setVisible(true);
    }
}