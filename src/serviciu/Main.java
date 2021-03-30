package serviciu;

import card.*;
import conturi.Conturi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // vector
        Card[] list = new Card[3];
        list[0] = new Card("Stanescu Maria", 0, 11, 2022, 805, 2.5);
        list[1] = new Card("Mircea Catalin", 0, 1, 2023, 401, 2);
        list[2] = new Card("Ionescu Ioana", 0, 4, 2024, 297, 1.5);

        for (Card value : list) {
            System.out.println(value.getCOD() + value.getName() + value.getID());
        }

        Arrays.sort(list);

        int i =0;
        for (Card c : list){
            System.out.println("card" + ++i + " : " + c.getName() + " ID " + c.getID() + "cod: " + c.getCOD() + "comision: " + c.getComision());
        }

        // apelare contructor

        Conturi c = new Conturi("Ana Maria Buiciuc", "6000568022", 200, 3, 0);





    }
}
