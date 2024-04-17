import javax.swing.*;
class OknoSwing extends JFrame{
    OknoSwing(String nazwa){
        super(nazwa); //metoda super wywołuje konstruktor nadklasy
        setResizable(false);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}// koniec class Okno

public class DzialoSwing{
    public void main(String args[]){
        //Button – komponent graficzny przycisk
        Okno o = new Okno("Panel sterujący działem");
        JButton b= new JButton("Ognia");
        o.add(b);
        o.setVisible(true);
    }
}

// koniec class Dzialo
