package dummy.com.example.dummy.port;

import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ICustomerServicePort {
    List<Product> getCustomerProducts(long customerId);

    Customer addNewCustomer(CustomerPojo customer);
}
