package programaGastoEmpresa;

import java.util.Scanner;



public class UserCreation {
	
	
		public static void createUser() {
			
			Scanner reader = new Scanner (System.in);
			
			User newUser = new User();

			System.out.println("Tell me your name:");
			newUser.setName(reader.nextLine());

			System.out.println("Tell me your username:");
			newUser.setUserName(reader.nextLine());

			System.out.println("Tell me your age:");
			newUser.setAge(reader.nextInt());
			
			System.out.println("Tell me your password:");
			newUser.setPassword(reader.next());
			
			System.out.println("Tell me your email:");
			newUser.setEmail(reader.next());

			
			System.out.println(newUser.toString());

			

		}

	}
	

