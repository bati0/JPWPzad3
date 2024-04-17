import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

//działające rysowanie kreski ciągłej

class Ekran2 extends Canvas{
    public String s="Witam";
    private Font f;
    private int x,y;
    ArrayList<Point> points = new ArrayList<Point>();
    Ekran2(){
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
                //s=me.paramString();
                x=me.getX();
                y=me.getY();
                points.add(new Point(x,y));
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

        //g.drawString(s,20,220);
        int x2,y2;
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.red);
        int i=1;
        for(Point p:points){
            if (points.size() == 1){
                x2=(int)p.getX();
                y2=(int)p.getY();
                g2.fillOval(x2,y2,10,10);
            } else {
                g2.drawLine((int)p.getX(),(int)p.getY(),(int)points.get(i).getX(),(int)points.get(i).getY());
                i=i+1;
            }
        }
    }
}
public class Komunikator2 extends JFrame {
    Komunikator2(String nazwa){
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