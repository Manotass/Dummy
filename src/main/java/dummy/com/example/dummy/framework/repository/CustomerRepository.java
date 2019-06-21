package dummy.com.example.dummy.framework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dummy.com.example.dummy.framework.entity.customer.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
