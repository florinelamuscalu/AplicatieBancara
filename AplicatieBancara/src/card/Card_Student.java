package card;


import serviciu.Serviciu;

import java.util.Scanner;

public class Card_Student extends Card implements Serviciu {
    private double commission_0;

    // studentul face un transer ia 0
    public Card_Student(){}

    // constructor implicit
    public Card_Student(String Name, long ID, int Month_e, int Year_e, int COD, double comision, double comision_0) {
        super(Name,ID, Month_e, Year_e, COD, comision);
        this.commission_0 = comision_0;
    }

    // return commission
    public double getComision_0() {
        return commission_0;
    }

    // new commission
    public void setComision_0(int comision_0) { this.commission_0 = comision_0; }

    // pentru a scoate bani
    @Override
    public double commission(String NumeBanca) {
        String NumeBancaCard = "BF";

        if (NumeBancaCard.equals(NumeBanca)) {
            commission_0 = 0;
        } else commission_0 = 1.5;

        return commission_0;
    }


    @Override
    public void creareCard(){
        Scanner dim = new Scanner(System.in);

        System.out.println("Introdduceti nr de carduri ale studentilor ");

        int nrCarduri = dim.nextInt();

        Card c= new Card();
        Card_Student[] carduri = new Card_Student[nrCarduri];

        double comision;
        for (Card_Student card : carduri) {
            c.creareCard();
            System.out.println("Comisionul pentru studenti este automat 0");

            comision = 0;
            card = new Card_Student();
            card.setComision(comision);

        }
    }

}