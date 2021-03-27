package conturi;

import java.util.Random;
import java.util.Scanner;

public class Conturi {
    protected String Name;
    protected String CNP;
    protected int suma;
    protected int SoldMinim;
    protected double dobanda;
    protected int zi;
    protected int IDcont;


    public  Conturi () {

    }
    public Conturi(String Name, String CNP, int suma, double dobanda, int zi, int IDcont) {
        this.Name = Name;
        this.CNP = CNP;
        this.suma = suma;
        this.dobanda = dobanda;
        this.zi = zi;
        this.IDcont = IDcont;
    }

    public String getName() {
        return Name;
    }

    public int getSuma() {
        return suma;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }


    // plati programate
    // doband  0.15%
    // comision
    // se ia bani la inchidere
    // nu se ia bani la deschidere
    // retragere numerar 1% comision


    public void TipPlata(int zi){
        if (zi!= 0){
            System.out.println("tipul de plata este neprogramata");
        }
        else
            System.out.println("tipul de plata este programata, si este in fiecare " +  zi + " a lunii");
    }

    public void DeschidereInchidere(int cont){
        if(cont == 0){
            double com;
            System.out.println("O sa va deschideti primul cont, va rog sa imi spuneti datele dumneavoasra in ordinea: " +
                    "Nume, CNP");

            Scanner myData = new Scanner(System.in);
            Name = myData.nextLine();
            CNP = myData.nextLine();

            Random rnd = new Random();

            IDcont = 1+ rnd.nextInt(999);
            System.out.println("ID-ul contului dumneavoastra este: " + IDcont);
            System.out.println("trebui sa introduceti un sold minim de 100");

            SoldMinim = myData.nextInt();

            if( SoldMinim < 100)
                System.out.println("Mai trebuie sa adaugati bani");

            System.out.println("Pentru deschiderea contului trebuie sa introduceti un comision de 5");
            com = myData.nextDouble();

            if (com < 5)
                System.out.println("Cominionul este minim 5");
        }
        if(cont >= 1){
            System.out.println("Doriti sa va inchideti contul? Daca doriti scrieti mesajul 'da', daca nu scrieti 'nu' ");
            Scanner newMesaj = new Scanner(System.in);
            String mesaj = newMesaj.nextLine();

            if( mesaj == "da"){
                System.out.println("In cantul dumneavoastra aveti suma de:" + suma);
                double com = 0;
                com = (2.5 * suma)/ 100;
                System.out.println("Din acesti bani banca va retine comisionul de: " + com);
                Name = " 0";
                CNP = "0";
            }
            if(mesaj == "nu") {
                System.out.println("Va multumim ca ati trecut pe la noi!");
                System.out.println("Doriti sa aflati ce suma aveti in cont?");

            }
        }
    }

    public double IntretinereCont(){
        double plata = (suma *dobanda)/100;
        return plata;
    }




}
