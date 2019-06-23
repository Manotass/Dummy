package dummy.com.example.dummy.port;

import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ICustomerControllerPort {

    @GetMapping
    ResponseEntity<List<Product>> customerProducts(@RequestBody long customerId);

    @PostMapping
    ResponseEntity<Customer> addNewCustomer(@RequestBody CustomerPojo customer);
}
