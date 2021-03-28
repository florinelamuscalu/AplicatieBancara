package card;


import serviciu.Serviciu;

import java.util.Scanner;

public class CardCredit extends Card implements Serviciu {
    private int suma;

    public CardCredit(String Name, long ID, int Month_e, int Year_e, int COD, int comision, int suma) {
        super(Name,ID, Month_e, Year_e, COD, comision);
        this.suma = suma;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public void plata (String NumeBanca){
        double com = comision(NumeBanca);

        Scanner mySum = new Scanner(System.in);
        System.out.println("Introduceti suma de pa cardul de credit pentru a afala plata luata platirea cu cardul:");
        suma = mySum.nextInt();
        double plata = (suma * com )/ 100;
        System.out.println("Plata este: " + plata);
    }

    public void plata_anuala(){
        double com = comision_anual("credit");
        Scanner mySum = new Scanner(System.in);
        System.out.println("Introduceti suma maxima de pe cardul de credit: ");
        suma = mySum.nextInt();
        double plata = (suma * com)/100;
        System.out.println("Suma anula luata de pe card este: " + plata);
    }

    @Override

    public void creareCard() {
        Scanner dim = new Scanner(System.in);

        System.out.println("Introdduceti nr de carduri");

        int nrCarduri = dim.nextInt();
        CardCredit[] carduri = new CardCredit[nrCarduri];

        int sum;
        Scanner input = new Scanner(System.in);

        for (CardCredit card : carduri) {
            System.out.println("Introduceti suma de pe cardul de credit");

            sum = input.nextInt();
            card.setSuma(sum);

        }
    }
}
