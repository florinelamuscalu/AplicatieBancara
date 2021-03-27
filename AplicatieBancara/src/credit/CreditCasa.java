package credit;
// dobanda mai mica



public class CreditCasa extends Credit {
    private int avns;
    private double costuri; // cat se scade

    // anans mic
    // dobanda robor la 3 luni + marja de maxim 2%


    public CreditCasa(String Name, int venit, long suma, double Dobanda, int perioada, int avns, double costuri) {
        super(Name, venit, suma, Dobanda, perioada);
        this.avns = avns;
        this.costuri = costuri;
    }

    public int getAvns() {
        return avns;
    }

    public void setAvns(int avns) {
        this.avns = avns;
    }

    public double getCosturi() {
        return costuri;
    }

    public void setCosturi(double costuri) {
        this.costuri = costuri;
    }
}
