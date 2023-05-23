package homework_05_16_2023;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class OrderServiceTest {
    @Test
    public void testProcessOrderSuccessful() {
        GatewayPayment gatewayPayment = Mockito.mock(GatewayPayment.class);
        InventoryManager inventoryManager = Mockito.mock(InventoryManager.class);
        OrderService orderService = new OrderService(gatewayPayment, inventoryManager);
        double paymentAmount = 50.0;
        when(gatewayPayment.processPayment(paymentAmount)).thenReturn(true);
        String item = "ItemA";
        int quantity = 2;
        when(inventoryManager.checkStock(item, quantity)).thenReturn(true);
        boolean result = orderService.processOrder(item, quantity, paymentAmount);
        verify(gatewayPayment).processPayment(paymentAmount);
        verify(inventoryManager).checkStock(item, quantity);
        assertTrue(result);
    }

    @Test
    public void testProcessOrderFailed() {
        GatewayPayment gatewayPayment = Mockito.mock(GatewayPayment.class);
        InventoryManager inventoryManager = Mockito.mock(InventoryManager.class);
        OrderService orderService = new OrderService(gatewayPayment, inventoryManager);
        double paymentAmount = 50.0;
        when(gatewayPayment.processPayment(paymentAmount)).thenReturn(false);
        String item = "ItemB";
        int quantity = 6;
        when(inventoryManager.checkStock(item, quantity)).thenReturn(false);
        boolean result = orderService.processOrder(item, quantity, paymentAmount);
        verify(gatewayPayment).processPayment(paymentAmount);
        verify(inventoryManager).checkStock(item, quantity);
        assertFalse(result);
    }
}