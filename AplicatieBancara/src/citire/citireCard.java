package citire;


import card.Card;
import singleton.GenericSingleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class citireCard {

    /*
    * Constructor default
     */
    public citireCard (){}


    public static ArrayList<Card> CitireCard(String file_path) throws InstantiationException, IllegalAccessException{
        ArrayList<Card> carduri = new ArrayList<>();
        Card cardBuffer = GenericSingleton.getInstance(Card.class);
        try{
            File fisier = new File(file_path);
            Scanner input = new Scanner(fisier);
            String data = input.nextLine();
            while (input.hasNext()){
                data = input.nextLine();
                String[] date_fisier = data.split(",");
                cardBuffer.setName(date_fisier[0]);
                cardBuffer.setID(Long.parseLong(date_fisier[1]));
                cardBuffer.setMonth_e(Integer.parseInt(date_fisier[2]));
                cardBuffer.setYear_e(Integer.parseInt(date_fisier[3]));
                cardBuffer.setCOD(Integer.parseInt(date_fisier[4]));
                cardBuffer.setComision(Double.parseDouble(date_fisier[5]));
            }
            input.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Lipseste fisierul de citire!");
            e.printStackTrace();
            System.exit(0);
        }
        return carduri;
    }

}
