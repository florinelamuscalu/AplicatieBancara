package conturi;


import serviciu.ServiciuConturi;
import java.util.Random;

public class Conturi implements ServiciuConturi {
    protected String name;
    protected String CNP;
    protected double suma;
    protected int SoldMinim;
    protected double dobanda;
    protected int zi;
    protected long IDcont;


    // constructor default
    public  Conturi () { }

    // cosntructor implicit
    public Conturi(String name, String CNP,double suma, double dobanda, int zi, long IDcont) {
        this.name = name;
        this.CNP = CNP;
        this.suma = suma;
        this.dobanda = dobanda;
        this.zi = zi;
        Random rd = new Random();
        this.IDcont = 1 + rd.nextInt(999);
    }

    // constructor
    public Conturi(String name, String CNP,double suma, double dobanda,int soldMinim, int zi, long IDcont){
        this.name = name;
        this.CNP = CNP;
        this.suma = suma;
        this.dobanda = dobanda;
        this.zi = zi;
        this.IDcont = IDcont;
        this.SoldMinim = soldMinim;
    }


    // return name
    public String getName() {
        return name;
    }

    // retrun CNP
    public String getCNP() { return CNP; }

    // return suma adaugata lunar
    public double getSuma() {
        return suma;
    }

    // return SoldMinim
    public int getSoldMinim() {
        return SoldMinim;
    }

    // return Dobanda
    public double getDobanda() {
        return dobanda;
    }

    // return Zi
    public int getZi() {
        return zi;
    }

    // retrun ID
    public long getIDcont() {
        return IDcont;
    }

    // new name
    public void setName(String name) {
        name = name;
    }

    // new CNP
    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    // new sold
    public void setSoldMinim(int soldMinim) {
        SoldMinim = soldMinim;
    }

    // new dobanda
    public void setDobanda(double dobanda) {
        this.dobanda = dobanda;
    }

    // set suma
    public void setSuma(double suma) {
        this.suma = suma;
    }

    // set zi
    public void setZi(int zi) {
        this.zi = zi;
    }

    // new ID
    public void setIDcont(long IDcont) {
        this.IDcont = IDcont;
    }


    // intretineare contului
    public double IntretinereCont(){
        return (suma *dobanda)/100;
    }

    // tip plata
    public void TipPlata(int zi){
        if (zi == 0){
            System.out.println("tipul de plata este neprogramata");
        }
        else
            System.out.println("tipul de plata este programata, si este in fiecare " +  zi + " a lunii");
    }
}




