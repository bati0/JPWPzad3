//zadanie 3
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // Koniecznie należy pamiętać o importowaniu pakietu event
class Okno5 extends JFrame {
    JButton b1;
    JButton b2;
    Okno5(String nazwa){
        super(nazwa);
        setResizable(false);
        setLayout(new FlowLayout());
        b1=new JButton("Przycisk 1.");
        b2=new JButton("Przycisk 2.");
        add(b1);
        add(b2);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Przycisk 1");
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Przycisk 2");
            }
        });
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
public class Grafika3{
    public static void main(String[] args) {
        Okno5 o=new Okno5("Zdarzenia");
        o.setVisible(true);
    }
}