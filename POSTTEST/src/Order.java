public class Order {
    private String OID;
    private double amount;

    public Order(String OID, double amount) {
        this.OID = OID;
        this.amount = amount;
    }

    public String getOID() {
        return OID;
    }

    public double getAmount() {
        return amount;
    }
}