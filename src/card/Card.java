package card;

import java.util.Random;
import java.util.Scanner;

public class Card implements Comparable<Card> {
    protected String Name;
    protected long ID ;
    protected int Month_e;
    protected int Year_e;
    protected int COD;
    protected double comision;


    public Card (){

    }
    public Card(String Name, long ID,  int Month_e, int Year_e, int COD, double comision) {
        this.Name = Name;
        Random rd = new Random();
        this.ID = 1 + rd.nextInt(999);
        this.Month_e = Month_e;
        this.Year_e = Year_e;
        this.COD = COD;
        this.comision = comision;
    }

    public String getName() {
        return Name;
    }

    public long getID() {
        return ID;
    }

    public int getMonth_e() {
        return Month_e;
    }

    public int getYear_e() {
        return Year_e;
    }

    public int getCOD() {
        return COD;
    }

    public double getComision() {
        return comision;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setMonth_e(int month_e) {
        Month_e = month_e;
    }

    public void setYear_e(int year_e) {
        Year_e = year_e;
    }

    public void setCOD(int COD) {
        this.COD = COD;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double comision (String NumeBanca) {
        String NumeBancaCard = "BF";

        if(NumeBancaCard == NumeBanca){
            comision = 0;
        }
        else if (NumeBancaCard != NumeBanca){
            comision = 2;
        }

        return comision;
    }

    public double comision_anual (String type){
        switch (type) {
            case "student" -> comision = 0.5;
            case "credit" -> comision = 2.5;
            case "debit" -> comision = 1.7;
        }
        return comision;
    }

    public Card citire (Card c){

            Scanner newCard = new Scanner(System.in);
            System.out.println("Introduceti numele codul cardului, luna anul si comisionul");
            c.Name = newCard.nextLine();
            c.COD = newCard.nextInt();
            c.Month_e = newCard.nextInt();
            c.Year_e = newCard.nextInt();
            c.comision = newCard.nextDouble();

            Random rd = new Random();

           c.ID = 1 + rd.nextInt(999);
           return c;
    }

    @Override
    public int compareTo(Card o) {

        //long compareID = o.getID();

        // crescator
        //return (int) (this.ID - compareID);

        // descrescator

       // return (int) (compareID - this.ID);

        int cod = o.getCOD() ;
    return cod - this.COD;

    }




}
