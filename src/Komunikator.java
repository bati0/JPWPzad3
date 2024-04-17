import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Ekran extends Canvas{
    public String s="Witam";
    private Font f;
    Ekran (){
        super();
        f = new Font("Times New Roman",Font.BOLD,20);setFont(f);
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent ke){
                s=ke.paramString();
                repaint();
            }
        });
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                s=me.paramString();
                repaint();
            }
        });
        //dodane przezemnie
        addMouseWheelListener(new MouseWheelListener(){
            public void mouseWheelMoved(MouseWheelEvent me){
                s=me.paramString();
                repaint();
            }
        });
        //dodane przezemnie
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                s = e.paramString();
                repaint();
            }
        });
    }
    public void paint(Graphics g){
        g.drawString(s,20,220);
    }
}
public class Komunikator extends JFrame {
    Komunikator (String nazwa){
        super(nazwa);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        Komunikator2 okno = new Komunikator2("Komunikator");
        okno.setSize(600,500);
        Ekran2 e = new Ekran2();
        okno.add(e);

        okno.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("Dziękujemy za pracę...");
            }
        });
        okno.setVisible(true);
    }
}// koniec public class Komunikator