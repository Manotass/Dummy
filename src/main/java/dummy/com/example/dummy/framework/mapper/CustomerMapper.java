package dummy.com.example.dummy.framework.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import org.springframework.stereotype.Service;


public class CustomerMapper implements ICustomerMapper{
	
	@Autowired
	private ModelMapper modelMapper ;
	public Customer customerPojoToCustomerEntity(CustomerPojo customerPojo) {		
		return modelMapper.map(customerPojo, Customer.class);
	}

}
