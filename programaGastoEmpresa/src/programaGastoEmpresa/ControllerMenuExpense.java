package programaGastoEmpresa;

import java.util.Scanner;

public class ControllerMenuExpense {

		
	public static void StartExpense() {
			
		Scanner reader = new Scanner(System.in);
			
		User toCreate = new Expense();
			
			while(true) {
			
				Menu.mainMenu();
				
				int keyboard = reader.nextInt();
				
				switch (keyboard) {
				
				case 1: 
					UserCreation.createExpense(toCreate);
					break;
				
				case 2:
					boolean ExpenseValidate = Login.validateExpense( toCreate.getExpenseName(), toCreate.getPassword());
					System.out.println(toCreate.getName() + " validate: " + userValidate);
					break;
					
				default:
				    System.out.println(" please select a management ");
					
				}
				
			}
		}
	}


