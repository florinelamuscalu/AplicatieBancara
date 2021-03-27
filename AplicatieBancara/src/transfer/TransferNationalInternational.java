package transfer;


public class TransferNationalInternational extends Transfer {
    private String NameLocation;

    public TransferNationalInternational(int sumaTrans, String name, String nameLocation) {
        super(sumaTrans, name);
        NameLocation = nameLocation;
    }

    public String getNameLocation() {
        return NameLocation;
    }

    public void setNameLocation(String nameLocation) {
        NameLocation = nameLocation;
    }
}
