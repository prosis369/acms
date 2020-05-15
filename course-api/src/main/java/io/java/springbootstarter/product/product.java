package io.java.springbootstarter.product;

public class product {
	
	private String id;
	private String name;
	private String type;
	private String cost;
	private String description;
	
	public product() {
		
	}

	public product(String id, String name, String type, String cost, String description) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCost() {
		return cost;
	}
	
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
