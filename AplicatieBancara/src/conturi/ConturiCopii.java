package conturi;


import java.util.Random;
import java.util.Scanner;

public class ConturiCopii extends Conturi {
    private int varsta;
    private String type;

    public ConturiCopii(String name, String CNP, double suma, double dobanda, int zi, long IDcont) {
        super(name, CNP, suma, dobanda, zi, IDcont);
    }

    // pt majori comision mai mare
    // pt minori comision mai mic
    // suma lunara introdusa in cont


    public int getVarsta() {
        return varsta;
    }

    public String getType() {
        return type;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setType(String type) {
        this.type = type;
    }
}

    // copi < 14 platri trimestiale, dobanzi mai mici
    // copi > 14 are si comisionane si dobanzi

    // override peste DeschidereInchidere
//    @Override
//    public void DeschidereInchidere(int cont){
//        if(cont == 0){
//            double com;
//            System.out.println("O sa va deschideti primul cont, va rog sa imi spuneti datele dumneavoasra in ordinea: " +
//                    "Nume, CNP");
//
//            Scanner myData = new Scanner(System.in);
//            name = myData.nextLine();
//            CNP = myData.nextLine();
//
//            Random rnd = new Random();
//
//            IDcont = 1+ rnd.nextInt(999);
//            System.out.println("ID-ul contului dumneavoastra este: " + IDcont);
//            System.out.println("trebui sa introduceti un sold minim de 100");
//
//            SoldMinim = myData.nextInt();
//
//            if( SoldMinim < 100)
//                System.out.println("Mai trebuie sa adaugati bani");
//
//            System.out.println("Pentru deschiderea contului trebuie sa introduceti un comision de 2.49");
//            com = myData.nextDouble();
//
//            if (com < 2.49)
//                System.out.println("Cominionul este minim 4.49");
//        }
//        if(cont >= 1){
//            System.out.println("Doriti sa va inchideti contul? Daca doriti scrieti mesajul 'da', daca nu scrieti 'nu' ");
//            Scanner newMesaj = new Scanner(System.in);
//            String mesaj = newMesaj.nextLine();
//
//            if( mesaj == "da"){
//                System.out.println("In cantul dumneavoastra aveti suma de:" + suma);
//                double com = 0;
//                com = (2.5 * suma)/ 100;
//                System.out.println("Din acesti bani banca va retine comisionul de: " + com);
//                name = " 0";
//                CNP = "0";
//            }
//            if(mesaj == "nu") {
//                System.out.println("Va multumim ca ati trecut pe la noi!");
//                System.out.println("Doriti sa aflati ce suma aveti in cont?");
//
//            }
//        }
//    }
//
//    @Override
//    public double IntretinereCont() {
//        if (varsta < 14) {
//            dobanda = 1;
//        } else if (varsta > 14 && varsta < 25) {
//            dobanda = 1.5;
//        }
//        double plata = (suma * dobanda) / 100;
//        return plata;
//    }
//}
