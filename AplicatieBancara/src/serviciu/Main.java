package serviciu;

import card.*;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // vector
        Card[] list = new Card[3];
        list[0] = new Card("Stanescu Maria", 0, 11, 2022, 805, 2.5);
        list[1] = new Card("Mircea Catalin", 0, 1, 2023, 401, 2);
        list[2] = new Card("Ionescu Ioana", 0, 4, 2024, 297, 1.5);

        for (Card value : list) {
            System.out.println(value.getCOD() + value.getName() + value.getID());
        }

        Arrays.sort(list);

        int i =0;
        for (Card c : list){
            System.out.println("card" + ++i + " : " + c.getName() + " ID " + c.getID() + "cod: " + c.getCOD() + "comision: " + c.getComision());
        }
        
        Card carduri = new Card();

        //carduri.creareCard();

        // comisionul la scoaterea banilor de pe card
        System.out.println("Introduceti banca de unde scoateti banii");
        Scanner banck = new Scanner(System.in);
        String nameBanck = banck.next();
        double com = carduri.commission(nameBanck);
        System.out.println("Comisionul care se ia la folosirea cardului:" + com);

        // card student

        Card_Student[] cStudent = new Card_Student[3];
        cStudent[0] = new Card_Student("Chivescu Alexandra", 0, 11, 2023, 596, 0,0);
        cStudent[1] = new Card_Student("Racasean Ivona", 0, 3, 2023, 967, 0, 0);
        cStudent[2] = new Card_Student("Buiciuc Ana", 0, 8, 2023, 123, 0, 0);

        // afisare vector

        for (Card_Student st: cStudent){
            System.out.println("numele studentilor: " + st.getName() + " ID card " + st.getID());
        }

        // apelare creare card studenti

        Card_Student cst = new Card_Student();

        cst.creareCard();

        // comision lunar
        double com_lunar = cst.comision_lunar("student");
        System.out.println("Comisionul lunar care se ia de pe cardul studentilor este:" + com_lunar);

        // pentru scoaterea banilor de la banca
        System.out.println("Introduceti banca de unde scoateti banii");
        Scanner banckst = new Scanner(System.in);
        String nameBanckst = banckst.next();
        double comst = carduri.commission(nameBanckst);
        System.out.println("Comisionul care se ia la folosirea cardului:" + comst);

        // card credit

        CardCredit[] credit = new CardCredit[3];

        credit[0] = new CardCredit("Macovei Emilia", 0, 11, 2023, 569, 4, 80000);
        credit[1] = new CardCredit("Lungu Elisa", 0, 6, 2021, 852, 1.5,1200 );
        credit[2] = new CardCredit("Aravatu Andreea", 0, 9, 2022, 100, 2.16, 60500);

        for(CardCredit cr : credit){
            System.out.println("Numele creditantului " + cr.getName() + " ID card " + cr.getID() + " suma credit " + cr. getSuma());
        }

        // creare card

        CardCredit cr = new CardCredit();
        cr.creareCard();

       // banii luati cand platim/scoate bani de la alta banca
        System.out.println("Intorduceti numele banici de unde vreti sa platiti/ scoateti bani cu cardul de credit ");
        String banca = banck.next();
        cr.plata(banca);

        // comision lunar
        com_lunar = cst.comision_lunar("credit");
        System.out.println("Comisionul lunar care se ia de pe cardul de credit este:" + com_lunar);

        // card debit

        CardDebit[] debit = new CardDebit[3];

        debit[0] = new CardDebit("Geana Iustin", 0, 11, 2023, 593, 2.8, 8000, "angajat");
        debit[1] = new CardDebit("Racea Luiza", 0, 6, 2021, 823, 1,4000, "pensionar" );
        debit[2] = new CardDebit("Aravatu Alina", 0, 9, 2023, 120, 2.1, 6500, "angajat");

        for(CardDebit d : debit){
            System.out.println("Numele creditantului " + d.getName() + " ID card " + d.getID() + " suma credit " + d. getSuma());
        }

        // creare card

        CardDebit d = new CardDebit();
        d.creareCard();

        // banii luati cand platim/scoate bani de la alta banca
        System.out.println("Intorduceti numele banici de unde vreti sa platiti/ scoateti bani cu cardul de debit ");
        String banca_nume = banck.next();
        cr.plata(banca_nume);

        // comision lunar
        com_lunar = cst.comision_lunar("debit");
        System.out.println("Comisionul lunar care se ia de pe cardul de debit este:" + com_lunar);






    }
}
