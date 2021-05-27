package credit;


public class CreditStudenti extends Credit {
    private int taxa;

    public CreditStudenti(String Name, int venit, long suma, double Dobanda, int perioada, int taxa) {
        super(Name, venit, suma, Dobanda, perioada);
        this.taxa = taxa;
    }

    public CreditStudenti (){}

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    // calcul credit studenti in genarl
    @Override
    public double CalculCredit(int venit, int perioada){
        return ((((venit - (40 * venit)/ 100)) /2)* perioada) - (((((venit - (40 * venit)/ 100) /2)) * perioada) * ((12.38 + 8.89)/100));
    }

    // calcul credit studenti pentru achitarea taxei,banii pe care acestia trebuie sa ii dea
    public double CalculCreditTaxa(int taxa){
        return taxa + (taxa * (12.38 + 7.5)/100) ;
    }
}
