package object;

public class Expense {
	
	public String name;
	public double price;
	public int date; //crear clase MyDate_System.out.println(year+":"+with2digits+":"+day); // DD:MM:YYYY. 
	     
	    
	
	// Constructors
	public Expense() {}


	public Expense(String name, double price, int date) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
		
	}

	//Getters and setters
	
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


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}



	// toString
	
	@Override
	public String toString() {
		return "Expense [name=" + name + ", price=" + price + ", date=" + date + "]";
	}

  }

	
	
	
	