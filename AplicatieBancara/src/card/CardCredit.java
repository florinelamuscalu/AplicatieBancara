package card;


import serviciu.Serviciu;

import java.util.Scanner;

// suma reprezinta sold-ul initial de pe card
public class CardCredit extends Card implements Serviciu  {
    private int suma; // banii pe care clientul trebuie sa ii adauge in fiecare luna

    // constructor default
    public CardCredit(){}

    // constructor implicit
    public CardCredit(String Name, long ID, int Month_e, int Year_e, int COD, double comision, int suma) {
        super(Name,ID, Month_e, Year_e, COD, comision);
        this.suma = suma;
    }

    // return soldul
    public int getSuma() {
        return suma;
    }

    // new sold
    public void setSuma(int suma) {
        this.suma = suma;
    }


    // functie pentru a afla banii luati in fiecare luna de pe card
    public void plata (){
        Card c = new Card();
        double commission = c.comision_lunar("credit");

        Scanner mySum = new Scanner(System.in);
        System.out.println("Introduceti suma lunara pe care o adaugati pe cardul de credit:");
        suma = mySum.nextInt();
        double plata = (suma * commission )/ 100;
        System.out.println("Bani luati in fiecare luna sunt: " + plata);
    }

}
