package transfer;


public class TransferNationalInternational extends Transfer {
    private String NameLocation;

    public TransferNationalInternational(int sumaTrans, String nameLocation) {
        super(sumaTrans);
        this.NameLocation = nameLocation;
    }

    public String getNameLocation() {
        return NameLocation;
    }

    public void setNameLocation(String nameLocation) {
        NameLocation = nameLocation;
    }
}
