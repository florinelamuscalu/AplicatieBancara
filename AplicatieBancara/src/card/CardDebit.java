package card;

import serviciu.Serviciu;
import java.util.Scanner;

public class CardDebit extends Card implements Serviciu {
    private int suma;
    private String numeAsociatie; // numele de unde iei banii adica angajatorul, sau casa de pensii

    // constructor default
    public CardDebit(){}

    // constructor implicit
    public CardDebit(String Name, long ID, int Month_e, int Year_e, int COD, double comision, int suma, String numeAsociatie) {
        super(Name,ID,Month_e, Year_e, COD, comision);
        this.suma = suma;
        this.numeAsociatie = numeAsociatie;
    }

    // return suma
    public int getSuma() {
        return suma;
    }

    // new suma
    public void setSuma(int suma) {
        this.suma = suma;
    }

    // return nume asociatie
    public String getNumeAsociatie() { return numeAsociatie; }

    // new nume asociatie
    public void setNumeAsociatie(String numeAsociatie) { this.numeAsociatie = numeAsociatie; }

    // suma lunara pe care banca o incaseaza de la fiecare card
    public void plata_lunara(){
        double com = comision_lunar("debit");
        Scanner mySum = new Scanner(System.in);
        System.out.println("Introduceti suma maxima de pe card de debit: ");
        suma = mySum.nextInt();
        double plata = (suma * com)/100;
        System.out.println("Suma anula luata de pe card este: " + plata);
    }


}
