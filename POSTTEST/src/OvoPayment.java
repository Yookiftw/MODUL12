public class OvoPayment implements RefundablePaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Memanggil API OVO untuk pembayaran sebesar: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Melakukan refund OVO sebesar: " + amount);
    }
}