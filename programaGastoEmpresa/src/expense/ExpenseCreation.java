package expense;

import java.util.Scanner;

import object.User;

public class ExpenseCreation {

	public static void createUser(User newExpense) {
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Name:");
		newExpense.setName(reader.nextLine());

		System.out.println("Price:");
		newExpense.setUserName(reader.nextLine());

		System.out.println("Date:"); 
		newExpense.setAge(reader.nextInt());	
		
		System.out.println(newExpense.toString());
       
		

	}

}

