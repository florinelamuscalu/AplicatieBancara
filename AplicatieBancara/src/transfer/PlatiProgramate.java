package transfer;


public class PlatiProgramate extends Transfer {
    private int Day_p;
    private int Month_p;

    public PlatiProgramate(int sumaTrans, String name, int day_p, int month_p) {
        super(sumaTrans, name);
        Day_p = day_p;
        Month_p = month_p;
    }

    public int getDay_p() {
        return Day_p;
    }

    public void setDay_p(int day_p) {
        Day_p = day_p;
    }

    public int getMonth_p() {
        return Month_p;
    }

    public void setMonth_p(int month_p) {
        Month_p = month_p;
    }
}
