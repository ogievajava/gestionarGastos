package programaGastoEmpresa;

import java.util.Scanner;

	public class Controller {
		
		public static void AppStarting() {

		while (true) {
			
			Scanner reader = new Scanner(System.in);
			System.out.println("Tell me your user name(\"quit\" to exit):");
			String userName = reader.nextLine();
			
			if(userName.equals("quit")) break;
			
			System.out.println("Tell me your type of user:");
			String userType = reader.nextLine();
			
			System.out.println("Tell me your amount of your buy:");
		    String userBuy = reader.nextLine();
			
			System.out.println("\nUser:");
			System.out.println("User Name: " + userName);
			System.out.println("User Type: " + userType);
			System.out.println("User Buy: " + userBuy);
			
			
			
		}
			
	}

		public static void executeController() {
			// TODO Auto-generated method stub
			
		}
}
