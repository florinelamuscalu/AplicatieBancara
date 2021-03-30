package conturi;

import serviciu.Serviciu;

import java.util.Random;
import java.util.Scanner;

public class Conturi implements Serviciu {
    protected String Name;
    protected String CNP;
    protected double suma;
    protected int SoldMinim;
    protected double dobanda;
    protected long IDcont;


    public  Conturi () {

    }
    public Conturi(String Name, String CNP,double suma, double dobanda,long IDcont) {
        this.Name = Name;
        this.CNP = CNP;
        this.suma = suma;
        this.dobanda = dobanda;
        Random rd = new Random();
        this.IDcont = 1 + rd.nextInt(999);
    }

    public String getName() {
        return Name;
    }

    public double getSuma() {
        return suma;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public void setSoldMinim(int soldMinim) {
        SoldMinim = soldMinim;
    }

    public void setDobanda(double dobanda) {
        this.dobanda = dobanda;
    }

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
        if (this.Name.equals(Name)) {
            this.Name = "-1";
            this.CNP = "-1";
            this.dobanda = -1;
        }
        return this.SoldMinim;
    }


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

    public double IntretinereCont(){
        return (suma *dobanda)/100;
    }




}
