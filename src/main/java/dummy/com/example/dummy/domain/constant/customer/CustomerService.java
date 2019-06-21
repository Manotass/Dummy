package dummy.com.example.dummy.domain.constant.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import dummy.com.example.dummy.application.customer.CustomerHandler;
import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.framework.entity.product.Product;
import dummy.com.example.dummy.framework.repository.ProducrRepository;

public class CustomerService implements CustomerHandler{

	@Autowired
	private ProducrRepository producrRepository;
	
	public List<Product> getCustomerProducts(CustomerPojo customer) {
		return producrRepository.findAllByCustomerId(customer.getId());
	}

}
