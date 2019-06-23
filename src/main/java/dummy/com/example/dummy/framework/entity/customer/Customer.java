package dummy.com.example.dummy.framework.entity.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import dummy.com.example.dummy.domain.constant.customer.CustomerCategory;

@Entity
public class Customer {
	@Id
	private long id;
	@Column
	private String name;
	@Column
	private String lastName;	
	@Column
	private CustomerCategory category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public CustomerCategory getCategory() {
		return category;
	}
	public void setCategory(CustomerCategory category) {
		this.category = category;
	}
}
