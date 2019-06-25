package dummy.com.example.dummy.adapter.Repository;

import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;
import dummy.com.example.dummy.port.ICustomerRepositoryPort;
import dummy.com.example.dummy.framework.repository.CustomerRepository;
import dummy.com.example.dummy.framework.repository.ProducrRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerRepositoryAdapter implements ICustomerRepositoryPort {

    @Autowired
    private ProducrRepository producrRepository;
    @Autowired
    private CustomerRepository customerRepository;

    public List<Product> getCustomerProducts(long customerId) {

        return producrRepository.findAllByCustomerId(customerId);
    }

    public Customer addNewCustomer(Customer customer) {

        return customerRepository.save(customer);
    }
}
