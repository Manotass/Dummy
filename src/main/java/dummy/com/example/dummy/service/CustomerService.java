package dummy.com.example.dummy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.port.ICustomerRepositoryPort;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;
import dummy.com.example.dummy.framework.mapper.ICustomerMapper;

@Service
public class CustomerService {

	@Autowired
	private ICustomerRepositoryPort customerRepositoryPort;

	@Autowired
	private ICustomerMapper customerMapper;

	public List<Product> getCustomerProducts(long customerId) {
		return customerRepositoryPort.getCustomerProducts(customerId);
	}

	public Customer addNewCustomer(CustomerPojo customer) {
		return customerRepositoryPort
				.addNewCustomer(customerMapper.customerPojoToCustomerEntity(customer));
	}

}
