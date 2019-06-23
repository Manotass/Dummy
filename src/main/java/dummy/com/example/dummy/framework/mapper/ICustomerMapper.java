package dummy.com.example.dummy.framework.mapper;

import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import org.springframework.stereotype.Component;

@Component
public interface ICustomerMapper {

	Customer customerPojoToCustomerEntity(CustomerPojo customerPojo);
}
