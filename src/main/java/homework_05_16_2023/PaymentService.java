package homework_05_16_2023;

public class PaymentService {
    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean processPayment(double amount) {
        return paymentGateway.processPayment(amount);
    }
}

class PaymentGateway {
    public boolean processPayment(double amount) {
        // Здесь реализация обработки платежа
        // В данном примере просто возвращается true или false
        return false;
    }
}
