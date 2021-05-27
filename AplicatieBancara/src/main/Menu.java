package main;

import DB.Delete;
import DB.Insert;
import DB.Update;
import card.Card;
import card.CardCredit;
import card.CardDebit;
import card.Card_Student;
import citire.citireCard;
import conturi.Conturi;
import conturi.ConturiCopii;
import credit.Credit;
import credit.CreditCasa;
import credit.CreditStudenti;
import DB.LoadDB;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {

    public void apelare () throws InterruptedException, SQLException, InstantiationException, IllegalAccessException {
        System.out.println("-------------------------------------");
        System.out.println("----------Va rugam sa alegeti o optiune----------");
        System.out.println("1. Comisionul de scoatere a banilor de la ATM la orice card");
        System.out.println("2. Comision lunar card");
        System.out.println("3. Tip de plata la card credit");
        System.out.println("4. Tip de plata la card debit");
        System.out.println("5. Intretinere cont");
        System.out.println("6. Tip de plata la conturi");
        System.out.println("7. Calcul credit");
        System.out.println("8. Calcul credit student dupa taxa");
        System.out.println("9. Plata credit casa");
        System.out.println("10. Recalculare dobanda casa");
        System.out.println("11. Conectarea la baza de date");
        System.out.println("12. Stergerea unui atribut din baza de date, tabela card");
        System.out.println("13. Actualizarea unui atribut din baza de date, tabela card");
        System.out.println("14. Inserarea in baza de date, in tabela card");
        System.out.println("15. Exit");
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("Tastati numarul optiunii");
        Scanner input = new Scanner(System.in);
        int optiune = input.nextInt();
        do {
            if(optiune == 15){
                System.exit(0);
            }else if(optiune > 15) {
                System.out.println("Nu avem acesta optiune. Alegeti 15 pentru a iesii");
                System.out.println("Scrieti optiunea");
                optiune = input.nextInt();
            }
            }while (optiune >= 15);
        do {
            switch (optiune) {
                case 1 -> {
                    System.out.println();
                    System.out.println("Pentru ce tip de card doriti?");
                    System.out.println("1. Pentru card student");
                    System.out.println("2. Pentru card credit");
                    System.out.println("3. Pentru card debit");
                    System.out.println("Intorduceti opriunea dorita: ");
                    optiune = input.nextInt();
                    System.out.println("Introduceti banca de unde scoateti banii");
                    String nameBanck = input.next();
                    if (optiune == 1) {
                        Card_Student cs = new Card_Student();
                        double com = cs.commission(nameBanck);
                        System.out.println("Comisionul care se ia la folosirea cardului:" + com);
                    } else if (optiune == 2) {
                        CardCredit  cc = new CardCredit();
                        double com = cc.commission(nameBanck);
                        System.out.println("Comisionul care se ia la folosirea cardului:" + com);
                    } else if (optiune == 3) {
                        CardDebit cd = new CardDebit();
                        double com = cd.commission(nameBanck);
                        System.out.println("Comisionul care se ia la folosirea cardului:" + com);
                    }
                    System.out.println();
                }
                case 2 -> {
                  System.out.println();
                  System.out.println("Pnetru ce tip de card doriti?");
                    System.out.println("Va rog sa scrieti tipul cardului! Tipul cardului poate fi doar: student, credit si debit");
                    String tipCard = input.next();
                    Card c = new Card();
                    double com = c.comision_lunar(tipCard);
                   System.out.println("Comisionul lunar este: " + com);
               }
                case 3 -> {
                    System.out.println();
                    System.out.println("Plata lunara pentru un card de credit este: ");
                    CardCredit cc = new CardCredit();
                    cc.plata();
                }
                case 4 -> {
                    System.out.println();
                    System.out.println("Plata lunara de pe cardul de debit este: ");
                    CardDebit cd = new CardDebit();
                    cd.plata_lunara();
                }
                case 5 -> {
                    System.out.println();
                    Conturi cont = new Conturi();
                    double intretinere = cont.IntretinereCont();
                    System.out.println("Intretinerea contului este: " + intretinere);
                }
                case 6 -> {
                    System.out.println();
                    System.out.println("Intorduceti ziua in care depuneti bani in cont, daca nu aveti o zi scrieti 0");
                    int zi = input.nextInt();
                    Conturi cont = new Conturi();
                    cont.TipPlata(zi);
                }
                case 7 -> {
                    System.out.println();
                    System.out.println("Pentru cine vreti sa faceti creditul?");
                    System.out.println("1. Pentru studenti cei care  lucreaza");
                    System.out.println("2. Pentru persoane juridice sau fizice");
                    optiune = input.nextInt();
                    System.out.println("Introduceti venitul dumneavoastra: ");
                    int venit = input.nextInt();
                    System.out.println("Introduceti perioada pe care vreti sa faceti creditul: ");
                   int perioada = input.nextInt();
                    if (optiune == 1) {
                        CreditStudenti cs = new CreditStudenti();
                        double credit = cs.CalculCredit(venit, perioada);
                       System.out.println("Creditul pe care il puteti avea este: " + credit);
                    } else if (optiune == 2) {
                        Credit c = new Credit();
                        double credit = c.CalculCredit(venit, perioada);
                        System.out.println("Creditul pe care il puteti avea este: " + credit);
                    }
               }
                case 8 -> {
                    System.out.println();
                    System.out.println("Introduceti taxa dumneavoastra: ");
                    int taxa = input.nextInt();
                    CreditStudenti cs = new CreditStudenti();
                    double credit = cs.CalculCreditTaxa(taxa);
                   System.out.println("Bani pe care trebuie sa ii inapoiati sunt: " + credit);
                }
                case 9 -> {
                    System.out.println();
                    System.out.println("Introduceti suma pe care o vreti, avansul si perioada");
                   double suma = input.nextDouble();
                    double avans = input.nextDouble();
                    int perioada = input.nextInt();
                    CreditCasa cc = new CreditCasa();
                    double plata = cc.plata(suma, avans, perioada);
                    System.out.println("Plata creditului este: " + plata);
                }
                case 10 -> {
                    System.out.println();
                    System.out.println("Introduceti dobanda pe care ati avut-o pana acum. Dobanda se recalculeaza la 3 luni");
                    double dobanda = input.nextDouble();
                    CreditCasa cc = new CreditCasa();
                    double newDobanda = cc.recalculareDobanaLa3Luni(dobanda);
                    System.out.println("Dobanda dumneavoastra este: " + newDobanda);
                }
                case 11 -> {
                    System.out.println();
                    System.out.println("Conecatrea la DB si afisarea tablelor: card, conturi, credite si transfer");
                    LoadDB l = new LoadDB();
                    l.loadDBcard();
                    l.loadDBconturi();
                    l.loadDBcredit();
                    l.loadDBTransfer();
                }
                case 12 ->{
                    System.out.println();
                    System.out.println("Sterge un atribut din card dupa un id");
                    System.out.println("Introduceti noul id: ");
                    int id = input.nextInt();
                    Delete d = null;
                    d.DeleteDB(id);
                }
                case 13 -> {
                    System.out.println();
                    System.out.println("Actualizam baza de date, tabela card atributul commission");
                   int id1 = input.nextInt();
                    double coms = input.nextInt();
                    Update up = null;
                    up.updateCard(id1, coms);
                }
                case 14 -> {
                    System.out.println();
                    System.out.println("O sa inseram in tabela card");
                    int id = input.nextInt();
                    double com = input.nextDouble();
                    String nameDB = input.next();
                    String name = input.next();
                    int month = input.nextInt();
                    int year = input.nextInt();
                    int cod = input.nextInt();
                    double commission_standard = input.nextDouble();
                    Insert i = null;
                    i.insert(nameDB,id,com,name,month,year,cod,commission_standard);
                }
            }
           TimeUnit.MILLISECONDS.sleep(3000);
            System.out.println("Doritii sa alegeti si alte optiunii?");
            System.out.println("1: Da");
            System.out.println("2: Nu");
            System.out.print("Introduceti numarul:");
            int optiuneNoua = input.nextInt();
            if (optiuneNoua == 1){
                System.out.println("-------------------------------------");
                System.out.println("----------Va rugam sa alegeti o optiune----------");
                System.out.println("1. Comisionul de scoatere a banilor de la ATM la orice card");
                System.out.println("2. Comision lunar card");
                System.out.println("3. Tip de plata la card credit");
                System.out.println("4. Tip de plata la card debit");
                System.out.println("5. Intretinere cont");
                System.out.println("6. Tip de plata la conturi");
                System.out.println("7. Calcul credit");
                System.out.println("8. Calcul credit student dupa taxa");
                System.out.println("9. Plata credit casa");
                System.out.println("10. Recalculare dobanda casa");
                System.out.println("11. Conectarea la baza de date");
                System.out.println("12. Stergerea unui atribut din baza de date, tabela card");
                System.out.println("13. Actualizarea unui atribut din baza de date, tabela card");
                System.out.println("14. Inserarea in baza de date, in tabela card");
                System.out.println("15. Exit");
                System.out.println("------------------------------------------------");
                System.out.println();
                System.out.println("Tastati numarul optiunii");
                optiune = input.nextInt();
            }else {
                System.exit(0);
            }
        }while (optiune < 16);
        System.exit(0);
        }

    }
