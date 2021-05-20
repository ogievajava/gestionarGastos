package programaGastoEmpresa;

import java.util.Scanner;

public class Controller {

	
	public static void AppStarting() {
		
		Scanner reader = new Scanner(System.in);
		
		User toCreate = new User();
		
		while(true) {
		
			Menu.mainMenu();
			
			int keyboard = reader.nextInt();
			
			switch (keyboard) {
			
			case 1: 
				UserCreation.createUser(toCreate);
				break;
			
			case 2:
				boolean userValidate = Login.validateUser( toCreate.getUserName(), toCreate.getPassword());
				System.out.println(toCreate.getName() + " validate: " + userValidate);
				break;
				
			default:
			    System.out.println("Please select an option");
				
				
			}
			
			
		
		
		
		}
		
		
		
	}
	/*
	 * public static void AppStarting() {
	 * 
	 * // scope #2 Scanner reader = new Scanner(System.in);
	 * 
	 * String userToCreateAccount = reader.nextLine();
	 * 
	 * ArrayList<String> account = new ArrayList<String>();
	 * 
	 * account.add(userToCreateAccount);
	 * 
	 * 
	 * boolean isValidated = Login.validateAccount(reader, account);
	 * 
	 * if (isValidated) {
	 * 
	 * Utils.printArray(account);
	 * 
	 * account = AccountUpdating.updateUser(reader, account); account =
	 * AccountUpdating.updateEmail(reader, account); account =
	 * AccountUpdating.updatePasswod(reader, account);
	 * 
	 * Utils.printArray(account);
	 * 
	 * // fake deleting ... account = AccountDeleting.deleteAccount(account);
	 * 
	 * Utils.printArray(account); isValidated = false; }
	 * 
	 * reader.close(); }
	 */

}