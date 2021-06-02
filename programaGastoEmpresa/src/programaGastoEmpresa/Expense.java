package programaGastoEmpresa;

public class Expense {
	
	// Attributes
	
	public String name;
	public double price;
	public String date;
	
	
	// Constructors
	
	
	
	
	public Expense () {
		
	}
	
	public Expense(String name, String date, double price) {
		
		this.name = name;
		this.price = price;
		this.date = date;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	@Override
	public String toString() {
		return "Expense [name=" + name + ", price=" + price + ", date=" + date + "]";
	}




	

	
}
