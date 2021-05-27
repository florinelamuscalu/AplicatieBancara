package credit;


public class Credit {
    protected String name;
    protected int venit;
    protected long suma;
    protected double dobanda;
    protected int perioada;  // nr luni


   /*
   * Constructor default
    */
    public Credit(){}

    /*
    * Constructor create new Credit
    *
    * @param name String
    * @param venit int
    * @param suma long
    * @param dobanda double
    * @param perioada int
    *
    */
    public Credit(String Name, int venit, long suma, double Dobanda, int perioada) {
        this.name = Name;
        this.venit = venit;
        this.suma = suma;
        this.dobanda = Dobanda;
        this.perioada = perioada;
    }

    /*
    * return Name
    *
    * @param name String
    */
    public String getName() {
        return name;
    }

    /*
    * return venit
    *
    * @param venit int
     */
    public int getVenit() {
        return venit;
    }

    /*
    * return suma
    *
    * @param suma long
     */
    public long getSuma() {
        return suma;
    }

    /*
    * return dobanda
    *
    * @param dobanda double
     */
    public double getDobanda() {
        return dobanda;
    }

    /*
    * return perioada
    *
    * @param perioada int
     */
    public int getPerioada() {
        return perioada;
    }

    /*
    * set name
    *
    * @param name String
    */
    public void setName(String name) {
        name = name;
    }

    /*
    * set venit
    *
    * @param venit int
    */
    public void setVenit(int venit) {
        this.venit = venit;
    }

    /*
    * set suma
    *
    * @param suma long
    */
    public void setSuma(long suma) {
        this.suma = suma;
    }

    /*
    * set dobanda
    *
    * @param dobanda double
    */
    public void setDobanda(double dobanda) {
        dobanda = dobanda;
    }

    /*
    * set perioada
    *
    * @param perioda int
     */
    public void setPerioada(int perioada) {
        this.perioada = perioada;
    }


    // venit net
    // 40 % cosu de alimente - mancare
    // dobanda 12 % an
    // DAE 24 %
    // administrare cont

    // (venit - 40% * venit) / 2 * perioada --> imprumut net
    // imp - imp * (DAE+dobanda) --> bani mana

    // pentru calul credit se respecta regurile de mai sus  DAE = 19.21% pe an + dobanda
    public double CalculCredit(int venit, int perioada){
        return ((((venit - (40 * venit)/ 100)) /2)* perioada) - (((((venit - (40 * venit)/ 100) /2)) * perioada) * ((19.21 + 15.92)/100));
    }


}
