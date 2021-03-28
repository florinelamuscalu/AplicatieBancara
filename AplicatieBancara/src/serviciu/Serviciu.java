package serviciu;

import card.Card;

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
        }


    }
}
