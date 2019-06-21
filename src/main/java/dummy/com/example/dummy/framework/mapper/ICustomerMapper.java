package dummy.com.example.dummy.framework.mapper;

import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.framework.entity.customer.Customer;

public interface ICustomerMapper {

	public Customer customerPojoToCustomerEntity(CustomerPojo customerPojo);
}
