package card;


public class Card_Student extends Card {
    private double comision_0;

    // studentul face un transer ia 0


    public Card_Student(String Name, long ID, int Month_e, int Year_e, int COD, int comision, double comision_0) {
        super(Name,ID, Month_e, Year_e, COD, comision);
        this.comision_0 = comision_0;
    }

    public double getComision_0() {
        return comision_0;
    }

    public void setComision_0(int comision_0) {
        this.comision_0 = comision_0;
    }

    public double comision(String NumeBanca) {
        String NumeBancaCard = "BF";

        if (NumeBancaCard == NumeBanca) {
            comision = 0;
        } else if (NumeBancaCard != NumeBanca) {
            comision = 1.5;
        }

        return comision;
    }

}
