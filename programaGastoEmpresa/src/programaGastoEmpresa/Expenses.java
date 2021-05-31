package programaGastoEmpresa;

import java.util.HashMap;

public class Expenses {
	
	public HashMap<String, Expense> expenses ;
	public Integer counter = 0;
	
	
	public Expenses() {
		
		this.expenses =  new HashMap<String, Expense>();
	}


	public void addExpense(String title, String description, double qty) {
		
		Expense newExpense = new Expense(title, description, qty);
		counter++;
		this.getExpenses().put( counter.toString()  + "_"  + title, newExpense);
		
		
	}
	
	
	
	
	public HashMap<String, Expense> getExpenses() {
		return expenses;
	}


	public void setExpenses(HashMap<String, Expense> expenses) {
		this.expenses = expenses;
	}
	
	
	
	
	

}
