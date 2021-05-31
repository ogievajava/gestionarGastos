package programaGastoEmpresa;

public class Expense {
	
	// Attributes
	
	public String title;
	public String description;
	public double qty;
	
	
	// Constructors
	
	public Expense() {
		
	}
	
	
	public Expense(String title, String description, double qty) {
		
		this.title = title;
		this.description = description;
		this.qty = qty;
	}
	
	
	// Methods 


	
	
	
	
	// Getters and Setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Expense [title=" + title + ", description=" + description + ", qty=" + qty + "]";
	}
	
	
	
	

}
