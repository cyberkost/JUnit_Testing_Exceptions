package homework_module_5.JUnit_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerServiceTest {
    private CustomerService customerService;

    @BeforeEach
    public void setup() {
        customerService = new CustomerService();
        Customer customer1 = new Customer("1", "Maikl Naki");
        Customer customer2 = new Customer("2", "Ruslan Liview");
        customerService.addCustomer(customer1);
        customerService.addCustomer(customer2);
    }

    @Test
    public void testGetCustomerById() {
        String customerId = "1";
        Customer customer = customerService.getCustomerById(customerId);
        Assertions.assertEquals(customerId, customer.getId());
        Assertions.assertEquals("Maikl Naki", customer.getName());
    }
}