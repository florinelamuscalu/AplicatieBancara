package main;

import card.Card;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSV {

    /*
    * Cosntructor default
    *
     */
    public CSV(){}

    public static void CreateCSVcard() throws FileNotFoundException{
        String line = "";
        String splitBy=",";

        try{
            // parsing a CSV file into BufferREader class constructor
            BufferedReader br = new BufferedReader(new FileReader("Card.csv"));
            while ((line = br.readLine()) != null){
                    String[] card=line.split(splitBy);
                System.out.println("Card [Nume detinator= " + card[0] + " ID= " + card[1] + " luna= " + card[2] +
                        " an= " + card[3] + " comision= " + card[4]);
            }
        }
        catch (IOException e){
            System.out.println("Fisierul nu poate fi deschis!");
            e.printStackTrace();
            System.out.println("0");
        }
    }

}
