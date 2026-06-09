public class CreditCard implements RefundablePaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Mengeksekusi API Bank untuk pembayaran kartu kredit sebesar: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Melakukan refund kartu kredit sebesar: " + amount);
    }
}