package dummy.com.example.dummy.framework.delegate;

import java.util.List;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;

public interface ICustomerDelegate {

	List<Product> getCustomerProducts(long customerId);
	
	Customer addNewCustomer(Customer customer) ;

}
