public class GiftVoucher implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Menggunakan Gift Voucher sebesar: " + amount);
    }
}