package homework_05_16_2023;

public class OrderService {
    private GatewayPayment gatewayPayment;
    private InventoryManager inventoryManager;

    public OrderService(GatewayPayment gatewayPayment, InventoryManager inventoryManager) {
        this.gatewayPayment = gatewayPayment;
        this.inventoryManager = inventoryManager;
    }

    public boolean processOrder (String item, int quantity, double paymentAmount){
        boolean paymentSuccess = gatewayPayment.processPayment(paymentAmount);
        boolean stockAvailable = inventoryManager.checkStock(item,quantity);
        return paymentSuccess && stockAvailable;
    }
}

class GatewayPayment {
    public boolean processPayment(double amount) {
        return false;
    }
}

class InventoryManager {
    public boolean checkStock(String item, int quantity) {
        return false;
    }
}