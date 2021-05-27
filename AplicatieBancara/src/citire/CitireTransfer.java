package citire;

import singleton.GenericSingleton;
import transfer.Transfer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CitireTransfer {


    /*
     * Constructor default
     */
    public CitireTransfer (){}


    public static ArrayList<Transfer> CitireTransfer(String file_path) throws InstantiationException, IllegalAccessException{
        ArrayList<Transfer> carduri = new ArrayList<>();
        Transfer transferBuffer = GenericSingleton.getInstance(Transfer.class);
        try{
            File fisier = new File(file_path);
            Scanner input = new Scanner(fisier);
            String data = input.nextLine();
            while (input.hasNext()){
                data = input.nextLine();
                String[] date_fisier = data.split(",");
                transferBuffer.setSumaTrans(Integer.parseInt(date_fisier[0]));
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
