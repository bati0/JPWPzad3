import java.awt.*;
class Okno extends Frame{
    Okno(String nazwa){
        super(nazwa); //metoda super wywołuje konstruktor nadklasy
        setResizable(false);
        setSize(400,400);
        Button b= new Button("Ognia");
        add(b);
        setVisible(true);
    }


}// koniec class Okno

public class Dzialo{
    public void main(String args[]){
        //Button – komponent graficzny przycisk
        Okno o = new Okno("Panel sterujący działem");
    }
}

// koniec class Dzialo
