package conturi;

import serviciu.ServiciuConturi;

import java.util.Random;
import java.util.Scanner;

public class Conturi implements ServiciuConturi {
    protected String name;
    protected String CNP;
    protected double suma;
    protected int SoldMinim;
    protected double dobanda;
    protected int zi;
    protected long IDcont;


    // constructor default
    public  Conturi () {

    }

    // cosntructor implicit
    public Conturi(String name, String CNP,double suma, double dobanda,int zi, long IDcont) {
        this.name = name;
        this.CNP = CNP;
        this.suma = suma;
        this.dobanda = dobanda;
        this.zi = zi;
        Random rd = new Random();
        this.IDcont = 1 + rd.nextInt(999);
    }


    // return name
    public String getName() {
        return name;
    }

    // return suma adaugata lunar
    public double getSuma() {
        return suma;
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

    // new ID
    public void setIDcont(long IDcont) {
        this.IDcont = IDcont;
    }

    // plati programate
    // doband  0.15%
    // comision
    // se ia bani la inchidere
    // nu se ia bani la deschidere
    // retragere numerar 1% comision


    // in vectorul meu tot ce este == -1 inseamna sters
    public int remove(String Name){
        if (this.name.equals(Name)) {
            this.name = "-1";
            this.CNP = "-1";
            this.dobanda = -1;
        }
        return this.SoldMinim;
    }

    // intretineare contului
    public double IntretinereCont(){
        return (suma *dobanda)/100;
    }

    // tip plata
    public void TipPlata(int zi){
        if (zi!= 0){
            System.out.println("tipul de plata este neprogramata");
        }
        else
            System.out.println("tipul de plata este programata, si este in fiecare " +  zi + " a lunii");
    }


    public Conturi[] DeschidereCont(){
        Scanner newDim = new Scanner(System.in);
        System.out.println("Introduceti numarul de carduri noi deschise: ");
        int dim = newDim.nextInt();

        Conturi[] Deschidere = new Conturi[dim];

        int soldMinim =0;

        for (Conturi conturi : Deschidere) {
            Scanner newObj = new Scanner(System.in);
            System.out.println("Scrieti numele detinatorului contului");
            String Name = newObj.next();
            conturi.setName(Name);

            System.out.println("Introduceti CNP-ul clientului:");
            String CNP = newObj.next();
            conturi.setCNP(CNP);

            System.out.println("Introduceti soldul din care puteti scoate bani, minim 1000:");
            soldMinim = newObj.nextInt();
            while (soldMinim < 1000) {
                System.out.println("nu a-ti introdus suma corecta");
                System.out.println("Introduceti din nou:");
                soldMinim = newObj.nextInt();
            }
            conturi.setSoldMinim(soldMinim);

            System.out.println("Introduceti procentul de dobanda:");
            double dobanda = newObj.nextDouble();
            conturi.setDobanda(dobanda);

            Random rd = new Random();
            long ID = 1 + rd.nextInt(999);
            conturi.setIDcont(ID);

        }
        return Deschidere;
    }

    public Conturi[] InchidereCont(String Name){

        Conturi[] DeschidereCont = DeschidereCont();

        for (Conturi cont:DeschidereCont) {
            int Sold = cont.remove(Name);
        }
        return DeschidereCont;
    }

    public void DeschidereInchidere(int cont){
        if(cont == 0){
            double com;
            System.out.println("O sa va deschideti primul cont");

            Conturi[] desc = DeschidereCont();

            for(Conturi conturi: desc) {
                Scanner myData = new Scanner(System.in);
                System.out.println("Pentru deschiderea contului aveti un comision egal cu 2% care o sa vi se ia din cont");
                com = myData.nextDouble();

                suma = conturi.SoldMinim - (com * conturi.SoldMinim) / 100;
            }

        }
        if(cont >= 1){
            System.out.println("Doriti sa va inchideti contul? Daca doriti scrieti mesajul 'da', daca nu scrieti 'nu' ");
            Scanner newMesaj = new Scanner(System.in);
            String mesaj = newMesaj.nextLine();

            if(mesaj.equals("da")){
                Conturi[] desc = DeschidereCont();
                for(Conturi conturi: desc) {
                    System.out.println("Spuneti-mi numele dumneavoastar");
                    Scanner oldName = new Scanner(System.in);
                    String Name = oldName.next();
                    System.out.println("In contul dumneavoastra aveti suma de:" + conturi.SoldMinim);
                    desc = InchidereCont(Name);
                    double com = 2.5;
                    double sum = conturi.SoldMinim - (2.5 * conturi.SoldMinim) / 100;
                    System.out.println("Banii dumneavoastra sunt: " + sum);
                }

            }
            if(mesaj.equals("nu")) {
                System.out.println("Va multumim ca ati trecut pe la noi!");
                System.out.println("Doriti sa aflati ce suma aveti in cont?");

            }
        }
    }

}
