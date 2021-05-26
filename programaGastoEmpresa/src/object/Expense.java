package object;

public class Expense {
	public String name;
	public String description;
	public double quantity;
	//public int myDate;
	
	
	// Constructors
	
	public Expense(String name, String description, double quantity) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}
	
	
	//Getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
