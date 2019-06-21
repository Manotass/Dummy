package dummy.com.example.dummy.framework.entity.product;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private long id;
	@Column
	private long customerId;
	@Column
	private String name;
	@Column
	private ProductCategory category; 
	@Column
	private ProductType type;
	@Column
	private Date adquisitionDate;
	@Column
	private String penalized;
	@Column
	private String statement;
}
