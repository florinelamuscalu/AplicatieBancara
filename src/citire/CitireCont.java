package citire;

import conturi.Conturi;
import singleton.GenericSingleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CitireCont {
    /*
     * Constructor default
     */
    public CitireCont(){ }

    public static ArrayList<Conturi> CitireCont(String file_path) throws InstantiationException, IllegalAccessException{
        ArrayList<Conturi> conturi = new ArrayList<>();
        Conturi conturiBuffer = GenericSingleton.getInstance(Conturi.class);
        try{
            File fisier = new File(file_path);
            Scanner input = new Scanner(fisier);
            String data = input.nextLine();
            while (input.hasNext()){
                data = input.nextLine();
                String[] date_fisier = data.split(",");
                conturiBuffer.setName(date_fisier[0]);
                conturiBuffer.setCNP(date_fisier[1]);
                conturiBuffer.setSuma(Double.parseDouble(date_fisier[2]));
                conturiBuffer.setSoldMinim(Integer.parseInt(date_fisier[3]));
                conturiBuffer.setDobanda(Double.parseDouble(date_fisier[4]));
                conturiBuffer.setZi(Integer.parseInt(date_fisier[5]));
                conturiBuffer.setIDcont(Long.parseLong(date_fisier[6]));
            }
            input.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Lipseste fisierul de citire!");
            e.printStackTrace();
            System.exit(0);
        }
        return conturi;
    }
}
