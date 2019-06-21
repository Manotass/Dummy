package dummy.com.example.dummy.application.customer;

import java.util.List;
import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;

public interface ICustomerService {

	public List<Product> getCustomerProducts(long customer);
	
	public Customer addNewCustomer(CustomerPojo customer);
}
