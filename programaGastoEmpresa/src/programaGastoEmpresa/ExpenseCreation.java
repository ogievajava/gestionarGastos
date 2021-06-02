  
package programaGastoEmpresa;

import java.util.Scanner;





public class ExpenseCreation {

	public static Expense expenseCreation (Expense newExpense) {
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Name:");
		newExpense.setName(reader.nextLine());

		System.out.println("Price:");
		newExpense.setPrice(reader.nextDouble());

		System.out.println("Date:"); 
		newExpense.setDate(reader.nextLine());	
		
		System.out.println(newExpense.toString());
		
		
       
		return newExpense;
		
		

	}

}