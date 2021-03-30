package credit;


public class CreditStudenti extends Credit {
    private int taxa;

    public CreditStudenti(String Name, int venit, long suma, double Dobanda, int perioada, int taxa) {
        super(Name, venit, suma, Dobanda, perioada);
        this.taxa = taxa;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    @Override

    public double calculDobandaBruta(){
        return (double) ((( getSuma() * getPerioada()) / 365)*100);
    }
}
