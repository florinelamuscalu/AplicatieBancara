package credit;


public class Credit {
    private String Name;
    private int venit;
    private long suma;
    private double Dobanda;
    private int perioada;  // nr zile

    public Credit(String Name, int venit, long suma, double Dobanda, int perioada) {
        this.Name = Name;
        this.venit = venit;
        this.suma = suma;
        this.Dobanda = Dobanda;
        this.perioada = perioada;
    }

    public String getName() {
        return Name;
    }

    public int getVenit() {
        return venit;
    }

    public long getSuma() {
        return suma;
    }

    public double getDobanda() {
        return Dobanda;
    }

    public int getPerioada() {
        return perioada;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setVenit(int venit) {
        this.venit = venit;
    }

    public void setSuma(long suma) {
        this.suma = suma;
    }

    public void setDobanda(double dobanda) {
        Dobanda = dobanda;
    }

    public void setPerioada(int perioada) {
        this.perioada = perioada;
    }

    public double calculDobandaBruta(){
        return ((suma * perioada * Dobanda) / 365)*100;
    }




}
