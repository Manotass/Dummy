package dummy.com.example.dummy.framework.delegate;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;
import dummy.com.example.dummy.framework.repository.CustomerRepository;
import dummy.com.example.dummy.framework.repository.ProducrRepository;

public class CustomerDelegate implements ICustomerDelegate {
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
