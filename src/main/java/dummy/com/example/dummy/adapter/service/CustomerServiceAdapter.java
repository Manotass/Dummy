package dummy.com.example.dummy.adapter.service;

import java.util.List;

import dummy.com.example.dummy.port.ICustomerServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.port.ICustomerRepositoryPort;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;
import dummy.com.example.dummy.framework.mapper.ICustomerMapper;


public class CustomerServiceAdapter implements ICustomerServicePort {

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
