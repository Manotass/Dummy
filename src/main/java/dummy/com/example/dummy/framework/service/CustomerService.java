package dummy.com.example.dummy.framework.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dummy.com.example.dummy.application.customer.ICustomerService;
import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.framework.delegate.ICustomerDelegate;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;
import dummy.com.example.dummy.framework.mapper.ICustomerMapper;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerDelegate customerDelegate;

	@Autowired
	private ICustomerMapper customerMapper;

	public List<Product> getCustomerProducts(long customerId) {
		return customerDelegate.getCustomerProducts(customerId);
	}

	public Customer addNewCustomer(CustomerPojo customer) {
		return customerDelegate
				.addNewCustomer(customerMapper.customerPojoToCustomerEntity(customer));
	}

}
