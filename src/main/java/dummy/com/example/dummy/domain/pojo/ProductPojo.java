package dummy.com.example.dummy.domain.pojo;

import java.util.Date;
import dummy.com.example.dummy.framework.entity.product.ProductCategory;
import dummy.com.example.dummy.framework.entity.product.ProductType;

public class ProductPojo {
	
	private long id;
	
	private long customerId;
	
	private String name;
	
	private ProductCategory category;

	private ProductType type;
	
	private Date adquisitionDate;
	
	private String penalized;
	
	private String statement;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public Date getAdquisitionDate() {
		return adquisitionDate;
	}

	public void setAdquisitionDate(Date adquisitionDate) {
		this.adquisitionDate = adquisitionDate;
	}

	public String getPenalized() {
		return penalized;
	}

	public void setPenalized(String penalized) {
		this.penalized = penalized;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}
}
