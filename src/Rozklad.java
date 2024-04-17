//zadanie 2 z schematem
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Okno4 extends JFrame {
    Okno4(String nazwa){
        super(nazwa);//metoda super wywołuje konstruktor nadklasy
        setResizable(false);
        setLayout(null);
        Insets in = new Insets(10, 10, 10, 10);

        JPanel left = new JPanel(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            c.ipadx =10;
            c.ipady =10;

            left.setBounds(0,0,400,400);
            left.setBackground(Color.black);

            JButton b1 = new JButton("JButton1");
            c.gridx=0; c.gridy=0; c.gridwidth=1;
            c.insets= new Insets(10,10,10,10); left.add(b1,c);
            JButton b2 = new JButton("JButton2");
            c.gridx=0; c.gridy=1; c.ipady =10; c.ipadx=50; c.weightx = 1;
            c.insets= in; left.add(b2,c);
            JButton b3 = new JButton("JButton3");
            c.gridx=0; c.gridy=2; c.ipady =10; c.gridwidth=1; c.ipadx=10;
            c.insets= new Insets(10,10,10,10); left.add(b3,c);
            JButton b4 = new JButton("JButton4");
            c.gridx=0; c.gridy=3; c.ipady =10; c.gridwidth=1; c.ipadx=0;
            c.insets= new Insets(10,10,10,10); left.add(b4,c);
            this.add(left);

        JPanel right = new JPanel(new GridBagLayout());
            GridBagConstraints c2 = new GridBagConstraints();
            c2.insets = new Insets(0,0,0,0);
            right.setBounds(400,0,200,400);
            right.setBackground(Color.gray);

            JLabel label = new JLabel("JLabel");
            c2.gridx=0; c2.gridy=0; c2.gridwidth=23;
            right.add(label,c2);

            JButton button = new JButton("JButton");
            c2.gridx=0; c2.gridy=1; c2.gridwidth=1;
            right.add(button,c2);

            JButton button2 = new JButton("JButton2");
            c2.gridx=1; c2.gridy=1; c2.gridwidth=1;
            right.add(button2,c2);

            List list = new List(2);
            c2.gridx=0; c2.gridy=2; c2.gridwidth=1;

            list.add("1");
            list.add("1");
            list.add("1");
            list.add("1");
            right.add(list,c2);

            JTextField textField = new JTextField("tu wpisz cos");
            textField.setBounds(10,10,100,100);
                c2.anchor = GridBagConstraints.PAGE_END;
                c.gridx=0; c.gridy=3; c.gridwidth=1;
            right.add(textField,c2);

            JButton button3 = new JButton("JButton2");
            c2.gridx=1; c2.gridy=1; c2.gridwidth=1;
            right.add(button3,c2);

            this.add(right);

        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
public class Rozklad{
    public static void main(String[] args) {
        Okno4 o=new Okno4("Rozklady");
        o.setVisible(true);
    }
}