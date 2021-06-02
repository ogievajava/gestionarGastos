package programaGastoEmpresa;

import java.util.Scanner;

public class ControllerMenuExpense {

		
	public static void startExpense() {
			
		Scanner reader = new Scanner(System.in);
			
	
			
			while(true) {
			
				MenuExpense.menuExpensesToPrint();
				
				int keyboard = reader.nextInt();
				
				switch (keyboard) {
				
				case 1:
					
					Expense toCreate = new Expense();
					toCreate  =ExpenseCreation.expenseCreation(toCreate);
					
					User.expenses.put(toCreate.getName(), toCreate);
					
					
					
					
					break;
				
				case 2:
					//boolean ExpenseValidate = Login.validateExpense( toCreate.getExpenseName(), toCreate.getPassword());
					//System.out.println(toCreate.getName() + " validate: " + userValidate);
					break;
					
				default:
				    System.out.println(" please select a management ");
					
				}
				
			}
		}
	}