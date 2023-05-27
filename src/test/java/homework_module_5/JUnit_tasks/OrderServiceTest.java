package homework_module_5.JUnit_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class OrderServiceTest {
    @Test
    public void testPlaceOrder() {
        Order.OrderService orderService = new Order.OrderService();

        int orderId = 1;
        String customerName = "John Doe";

        orderService.placeOrder(orderId, customerName);

        List<Order> orderDatabase = orderService.getOrderDatabase();

        Assertions.assertEquals(1, orderDatabase.size());

        Order order = orderDatabase.get(0);
        Assertions.assertEquals(orderId, order.getOrderId());
        Assertions.assertEquals(customerName, order.getCustomerName());
    }
}