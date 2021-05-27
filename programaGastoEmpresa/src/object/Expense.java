package object;

public class Expense {
	
	public String name;
	public String description;
	public double value;     //quantity
	public int date;     // System.out.println(year+":"+with2digits+":"+day); // DD:MM:YYYY. 
	
	
	// Constructors
	
	public Expense(String name, String description, double value, int date) {
		super();
		this.name = name;
		this.description = description;
		this.value = value;
		this.date = date;
	
	}
   public Expense(String expenseName, double valueExpense, int todayDate) {
		
		this.name = expenseName;
		this.value = valueExpense;
		this.date = todayDate;
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


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Expense [name=" + name + ", description=" + description + ", value=" + value + ", date=" + date + "]";
	}


}