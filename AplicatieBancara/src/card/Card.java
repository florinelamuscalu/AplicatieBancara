package card;

import java.util.Random;

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
    public Card() {}

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

    // constructor pentru loadDB
    public Card(long ID, String name,int month_e, int year_e,int COD, double commission_standar, double comision){
        this.ID = ID;
        this.name = name;
        this.month_e = month_e;
        this.year_e = year_e;
        this.COD =COD;
        this.commission_standar = commission_standar;
        this.comision = comision;
    }

    /*
    * return name
    *
    * @param name
     */
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

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", month_e=" + month_e +
                ", year_e=" + year_e +
                ", COD=" + COD +
                ", commission_standar=" + commission_standar +
                ", comision=" + comision +
                '}';
    }

    // pentru intretineare cardului
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
}

