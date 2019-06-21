package dummy.com.example.dummy.framework.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import dummy.com.example.dummy.application.customer.CustomerHandler;
import dummy.com.example.dummy.domain.pojo.CustomerPojo;
import dummy.com.example.dummy.framework.entity.product.Product;

@Controller
@CrossOrigin
public class CustomerProducts {

	@Autowired
	private CustomerHandler customerHandler;
	
	@GetMapping
	public ResponseEntity<List<Product>> customerProducts(@RequestBody CustomerPojo customer){
		return ResponseEntity.ok(customerHandler.getCustomerProducts(customer));		
	}
	
	@PostMapping
	public ResponseEntity<CustomerPojo> addNewCustomer(@RequestBody CustomerPojo customer){
		
	}
}
