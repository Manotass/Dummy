package dummy.com.example.dummy.framework.entity.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductType {
	@Id
	private long id;
	@Column
	private String description;
	@Column
	private String code;

}
