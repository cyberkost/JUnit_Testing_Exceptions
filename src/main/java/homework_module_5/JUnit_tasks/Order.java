package homework_module_5.JUnit_tasks;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private String customerName;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    static class OrderService {
        private List<Order> orderDatabase;

        public OrderService() {
            orderDatabase = new ArrayList<>();
        }

        public void placeOrder(int orderId, String customerName) {
            Order order = new Order(orderId, customerName);
            // сохраняем заказ в базе данных
            orderDatabase.add(order);
        }

        public List<Order> getOrderDatabase() {
            return orderDatabase;
        }
    }
}
