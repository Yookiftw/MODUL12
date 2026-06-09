public interface PaymentMethod {
    void pay(double amount);
}

public interface RefundablePaymentMethod extends PaymentMethod {
    void refund(double amount);
}