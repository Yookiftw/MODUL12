public class OrderService {
    private final OrderRepository orderRepository;
    private final PaymentMethod paymentMethod;
    private final EmailNotifier emailNotifier;

    public OrderService(OrderRepository orderRepository, PaymentMethod paymentMethod, EmailNotifier emailNotifier) {
        this.orderRepository = orderRepository;
        this.paymentMethod = paymentMethod;
        this.emailNotifier = emailNotifier;
    }

    public void processOrder(Order order) {
        orderRepository.save(order);
        paymentMethod.pay(order.getAmount());
        emailNotifier.sendEmail("Pesanan dengan ID " + order.getOID() + " telah berhasil diproses.");
    }
}