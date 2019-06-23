package dummy.com.example.dummy.port;

import java.util.List;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;
import org.springframework.stereotype.Component;

@Component
public interface ICustomerRepositoryPort {

	List<Product> getCustomerProducts(long customerId);
	
	Customer addNewCustomer(Customer customer) ;

}
