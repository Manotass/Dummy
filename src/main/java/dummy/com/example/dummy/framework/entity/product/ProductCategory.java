package dummy.com.example.dummy.framework.entity.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductCategory {
	@Id
	private long id;
	@Column
	private String description;
}
