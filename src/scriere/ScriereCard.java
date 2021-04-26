package scriere;

import java.io.FileWriter;
import java.io.IOException;

public class ScriereCard {

    private final static String path ="src/fisiere/Card.CSV";

    public static void scrieCard (String nume,Long ID, int luna, int an, int cod, double comision ) {
        FileWriter scrieFisier;
        try{
            scrieFisier = new FileWriter((path), true);

            String stringBuilder = nume +
                    "," +
                    ID +
                    "," +
                    luna +
                    "," +
                    an +
                    "," +
                    cod +
                    "," +
                    comision +
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
