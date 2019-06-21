package dummy.com.example.dummy.framework.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dummy.com.example.dummy.framework.entity.product.Product;

@Repository
public interface ProducrRepository extends JpaRepository<Product, Long>  {

	List<Product> findAllByCustomerId(long customerId);

}
