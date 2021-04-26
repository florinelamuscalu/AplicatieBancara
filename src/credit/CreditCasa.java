package credit;
// dobanda mai mica



public class CreditCasa extends Credit {
    private int avans;
    private double costuri; // cat se scade

    // anans mic
    // dobanda robor la 3 luni + marja de maxim 2%


    public CreditCasa(String Name, int venit, long suma, double Dobanda, int perioada, int avans, double costuri) {
        super(Name, venit, suma, Dobanda, perioada);
        this.avans = avans;
        this.costuri = costuri;
    }

    public int getAvns() {
        return avans;
    }

    public void setAvns(int avns) {
        this.avans = avns;
    }

    public double getCosturi() {
        return costuri;
    }

    public void setCosturi(double costuri) {
        this.costuri = costuri;
    }

    // avans = 30 %
    public double plata(){
        return (suma - avans / 100) / perioada;
    }

    public double recalculareDobanaLa3Luni(){
        return dobanda + (dobanda * 2 )/100;
    }

}
