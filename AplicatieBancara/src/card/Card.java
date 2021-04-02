package card;

import java.util.Random;
import java.util.Scanner;

// aici pastez toate datele de pe un card
public class Card implements Comparable<Card> {
    protected String name;
    protected long ID;
    protected int month_e;
    protected int year_e;
    protected int COD;
    protected double commission_standar;
    private double comision;


    // constructorul default al clasei Card
    public Card() {
    }

    // constructorul implicit al clasei Card
    public Card(String Name, long ID, int Month_e, int Year_e, int COD, double commission) {
        this.name = Name;
        Random rd = new Random();
        this.ID = 1 + rd.nextInt(999);
        this.month_e = Month_e;
        this.year_e = Year_e;
        this.COD = COD;
        this.commission_standar = commission;
    }

    // return name
    public String getName() {
        return name;
    }

    // return ID
    public long getID() {
        return ID;
    }

    // return month
    public int getMonth_e() {
        return month_e;
    }

    //return year
    public int getYear_e() {
        return year_e;
    }

    //return COD
    public int getCOD() {
        return COD;
    }

    // return commission
    public double getComision() {
        return commission_standar;
    }

    // new name
    public void setName(String name) {
        name = name;
    }

    // new ID
    public void setID(long ID) {
        this.ID = ID;
    }

    // new month
    public void setMonth_e(int month_e) {
        month_e = month_e;
    }

    // new year
    public void setYear_e(int year_e) {
        year_e = year_e;
    }

    // new COD
    public void setCOD(int COD) {
        this.COD = COD;
    }

    // new commission
    public void setComision(double comision) {
        this.commission_standar = comision;
    }

    // pentru a scoate bani de pe card
    public double commission(String NumeBanca) {
        String NumeBancaCard = "BF";

        if (NumeBancaCard.equals(NumeBanca)) {
            commission_standar = 0;
        } else commission_standar = 2;

        return commission_standar;
    }

    // pentru intretineare contului
    public double comision_lunar(String type) {
        switch (type) {
            case "student" -> commission_standar = 0.5;
            case "credit" -> commission_standar = 2.5;
            case "debit" -> commission_standar = 1.7;
        }
        return commission_standar;
    }


    @Override
    public int compareTo(Card o) {

        //long compareID = o.getID();

        // crescator
        //return (int) (this.ID - compareID);

        // descrescator

        // return (int) (compareID - this.ID);

        int cod = o.getCOD();
        return cod - this.COD;

    }

    // String newName, int cod, int month, int year, double commission, int nrCarduri
    public void creareCard(Card obiect, int nrCarduri) {

        Card[] carduri = new Card[nrCarduri];

        int ID;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < carduri.length; ++i) {
            System.out.println("Introduceti: numele detinatorului cardului, cod-ul cardului, " +
                    "luna in care o sa expire, anul in care o sa exprire si comisionul standard"
                    + "el o sa schimbe in functie de tipul cardului ");

            carduri[i] = new Card();
            carduri[i].setName(obiect.getName());


            carduri[i].setCOD(obiect.getCOD());


            carduri[i].setMonth_e(obiect.getMonth_e());


            carduri[i].setYear_e(obiect.getYear_e());


            carduri[i].setComision(obiect.getComision());

            Random rd = new Random();
            ID = 1 + rd.nextInt(999);
            carduri[i].setID(ID);
        }

    }
}

