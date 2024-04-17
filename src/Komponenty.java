//
import javax.swing.*;
import java.awt.*;
class Okno3 extends JFrame{
    Okno3(String nazwa){
        super(nazwa); //metoda super wywołuje konstruktor nadklasy
        setResizable(false);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class Komponenty {

    public static void main(String[] args) {
        Okno3 a=new Okno3("Panel sterowania");
//tworzenie komponentów
        JButton przyciskTest = new JButton("ognia");
        JLabel opis = new JLabel("Strzelac");
        Checkbox rak = new Checkbox("Rakieta");
        Checkbox bomb = new Checkbox("Bomba");
        Choice kolor = new Choice();
        kolor.add("zielona");
        kolor.add("czerwona");
        List lista = new List(2, false);
        lista.add("mała");
        lista.add("malutka");
        lista.add("wielka");
        lista.add("duza");
        lista.add("ogromna");
        lista.add("gigant");
        JTextField param = new JTextField("Podaj parametry");
        JPanel p=new JPanel();
//dodawanie komponentów do panelu
        p.add(przyciskTest);
        p.add(opis);
        p.add(rak);
        p.add(bomb);
        p.add(kolor);
        p.add(lista);
        p.add(param);
//dodanie panelu do okna głównego JFrame
        a.add(p);
        a.setVisible(true);
    }
}