package homework_05_16_2023;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class PaymentServiceTest {
    @Test
    public void testProcessPaymentSuccess() {
        PaymentGateway  paymentGateway = Mockito.mock(PaymentGateway .class);
        when(paymentGateway.processPayment(25.0)).thenReturn(true);
        PaymentService paymentService = new PaymentService(paymentGateway);
        boolean result = paymentService.processPayment(25.0);
        verify(paymentGateway).processPayment(25.0);
        assertTrue(result);
    }

    @Test
    public void testProcessPaymentFailed() {
        PaymentGateway  paymentGateway = Mockito.mock(PaymentGateway .class);
        when(paymentGateway.processPayment(50.0)).thenReturn(false);
        PaymentService paymentService = new PaymentService(paymentGateway);
        boolean result = paymentService.processPayment(50.0);
        verify(paymentGateway).processPayment(50.0);
        assertFalse(result);
    }
}