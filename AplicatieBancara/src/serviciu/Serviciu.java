package serviciu;


import card.Card;
import card.CardCredit;
import card.CardDebit;
import card.Card_Student;

public interface Serviciu {

     void creareCard(Card obiect, int nrCarduri);
      double commission(String NumeBanca);

}
