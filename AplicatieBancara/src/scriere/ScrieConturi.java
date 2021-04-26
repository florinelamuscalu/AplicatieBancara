package scriere;

import java.io.FileWriter;
import java.io.IOException;

public class ScrieConturi {
    private final static String path ="src/fisiere/Conturi.CSV";

    public static void scrieCard (String nume,String CNP,double suma, int SoldMinim, double dobanda, int zi, int IDcont) {
        FileWriter scrieFisier;
        try{
            scrieFisier = new FileWriter((path), true);

            String stringBuilder = nume +
                    "," +
                    CNP +
                    "," +
                    suma +
                    "," +
                    SoldMinim+
                    "," +
                    dobanda +
                    "," +
                    zi +
                    "," +
                    IDcont +
                    "\n";
            scrieFisier.write(stringBuilder);
            scrieFisier.flush();
            scrieFisier.close();
        }
        catch (IOException e){
            System.out.println("Nu se poate scrie :(");
            e.printStackTrace();
        }
    }
}
