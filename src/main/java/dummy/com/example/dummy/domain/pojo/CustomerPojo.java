package dummy.com.example.dummy.domain.pojo;

import dummy.com.example.dummy.domain.constant.customer.CustomerCategory;

public class CustomerPojo {
	
	private long id;
	
	private String name;
	
	private String lastName;	
	
	private CustomerCategory category;
	
	public CustomerPojo(long id, String name, String lastName, CustomerCategory category) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.category = category;
	}
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
