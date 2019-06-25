package dummy.com.example.dummy.adapter.controller;

import java.util.List;

import dummy.com.example.dummy.port.ICustomerControllerPort;
import dummy.com.example.dummy.port.ICustomerServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.framework.entity.customer.Customer;
import dummy.com.example.dummy.framework.entity.product.Product;

@RestController
@CrossOrigin
public class CustomerControllerAdapter implements ICustomerControllerPort {

	@Autowired
	private ICustomerServicePort customerService;

	@GetMapping
	public ResponseEntity<List<Product>> customerProducts(@RequestBody long customerId) {
		return ResponseEntity.ok(customerService.getCustomerProducts(customerId));
	}

	@PostMapping
	public ResponseEntity<Customer> addNewCustomer(@RequestBody CustomerPojo customer) {
		return ResponseEntity.ok(customerService.addNewCustomer(customer));
	}
}
