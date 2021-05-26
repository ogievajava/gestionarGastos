package programaGastoEmpresa;

import java.util.Scanner;

import menu.Menu;
import object.User;
import usercreation.Login;
import usercreation.UserCreation;

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
}
