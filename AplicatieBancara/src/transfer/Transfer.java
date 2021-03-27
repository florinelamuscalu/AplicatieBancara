package transfer;

public class Transfer {
    private int sumaTrans;
    private String Name;

    public Transfer(int sumaTrans, String name) {
        this.sumaTrans = sumaTrans;
        Name = name;
    }

    public int getSumaTrans() {
        return sumaTrans;
    }

    public void setSumaTrans(int sumaTrans) {
        this.sumaTrans = sumaTrans;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
