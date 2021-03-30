package serviciu;

import card.Card;
import conturi.Conturi;

import java.util.Random;
import java.util.Scanner;

public interface Serviciu {

    default void creareCard(){

        Scanner dim = new Scanner(System.in);

        System.out.println("Introdduceti nr de carduri");

        int nrCarduri = dim.nextInt();
        Card[] carduri = new Card[nrCarduri];

        String newName;
        int cod;
        int month;
        int year;
        double comision;
        int ID;
        Scanner input = new Scanner(System.in);

        for (int i =0; i<carduri.length; ++i){
            System.out.println("Introduceti: numele detinatorului cardului, cod-ul cardului, " +
                    "luna in care o sa expire, anul in care o sa exprire si comisionul");
            newName = input.next();
            carduri[i] = new Card();
            carduri[i].setName(newName);

            cod = input.nextInt();
            carduri[i].setCOD(cod);

            month = input.nextInt();
            carduri[i].setMonth_e(month);

            year = input.nextInt();
            carduri[i].setYear_e(year);

            comision = input.nextDouble();
            carduri[i].setComision(comision);

            Random rd = new Random();
            ID = 1 + rd.nextInt(999);
            carduri[i].setID(ID);
        }


    }

    default Conturi[] DeschidereCont(){
        Scanner newDim = new Scanner(System.in);
        System.out.println("Introduceti numarul de carduri noi deschise: ");
        int dim = newDim.nextInt();

        Conturi[] Deschidere = new Conturi[dim];

        int soldMinim =0;

        for (Conturi conturi : Deschidere) {
            Scanner newObj = new Scanner(System.in);
            System.out.println("Scrieti numele detinatorului cardului");
            String Name = newObj.next();
            conturi.setName(Name);

            System.out.println("Introduceti CNP-ul clientului:");
            String CNP = newObj.next();
            conturi.setCNP(CNP);

            System.out.println("Introduceti suma minima pe care acesta o adauga in cont, suma minima trebuie sa fie minim 100:");
             soldMinim = newObj.nextInt();
            while (soldMinim < 100) {
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


    default Conturi[] InchidereCont(String Name){

        Conturi[] DeschidereCont = DeschidereCont();

        for (Conturi cont:DeschidereCont) {
            int Sold = cont.remove(Name);
        }
        return DeschidereCont;
    }
}
