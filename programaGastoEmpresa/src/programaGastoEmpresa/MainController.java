package programaGastoEmpresa;

import java.util.ArrayList;
import java.util.Scanner;

//import model.User;

public class MainController {
	
	public static void AppStarting() {
		
		ArrayList<User>users = new ArrayList<User>();
		Scanner reader = new Scanner(System.in);
		
		While (true){
			
			Menu.mainMenu();
			String command = reader.nextLine();
			if(command.equals("quit")) {
				break;
			}else if(command.equals("create")) {
				UserCreation.createUser(reader,users);
			}else {
				System.out.println("Do you need to \"create\" an account or \"quit\");"
			}
			
		}
		
		reader.close();
	}

}
