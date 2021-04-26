package citire;

import credit.Credit;
import singleton.GenericSingleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CitireCredit {

    /*
     * Constructor default
     */
    public CitireCredit (){}


    public static ArrayList<Credit> CitireCredit(String file_path) throws InstantiationException, IllegalAccessException{
        ArrayList<Credit> credite = new ArrayList<>();
        Credit creditBuffer = GenericSingleton.getInstance(Credit.class);
        try{
            File fisier = new File(file_path);
            Scanner input = new Scanner(fisier);
            String data = input.nextLine();
            while (input.hasNext()){
                data = input.nextLine();
                String[] date_fisier = data.split(",");
                creditBuffer.setName(date_fisier[0]);
                creditBuffer.setVenit(Integer.parseInt(date_fisier[1]));
                creditBuffer.setSuma(Long.parseLong(date_fisier[2]));
                creditBuffer.setDobanda(Double.parseDouble(date_fisier[3]));
                creditBuffer.setPerioada(Integer.parseInt(date_fisier[4]));
            }
            input.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Lipseste fisierul de citire!");
            e.printStackTrace();
            System.exit(0);
        }
        return credite;
    }
}
