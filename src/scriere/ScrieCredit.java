package scriere;

import java.io.FileWriter;
import java.io.IOException;

public class ScrieCredit {

    private final static String path ="src/fisiere/Credit.CSV";

    // Nume,Venit,Suma,Dobanda,Perioada
    public static void scrieCard (String nume,int venit, int suma, double dobanda, int perioada ) {
        FileWriter scrieFisier;
        try{
            scrieFisier = new FileWriter((path), true);

            String stringBuilder = nume +
                    "," +
                    venit +
                    "," +
                    suma +
                    "," +
                    dobanda +
                    "," +
                    perioada +
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
