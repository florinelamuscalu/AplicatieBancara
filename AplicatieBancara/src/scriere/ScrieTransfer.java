package scriere;

import java.io.FileWriter;
import java.io.IOException;

public class ScrieTransfer {

    private final static String path ="src/fisiere/Card.CSV";

    public static void scrieCard (int suma) {
        FileWriter scrieFisier;
        try{
            scrieFisier = new FileWriter((path), true);

            String stringBuilder = suma +
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
