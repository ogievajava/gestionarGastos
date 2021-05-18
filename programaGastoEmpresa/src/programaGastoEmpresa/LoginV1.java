package programaGastoEmpresa;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginV1 {
	
		public static boolean loginRequest (Scanner reader, ArrayList<String> account) {

		// variables 
		//as userConsole Name and password
		//condition while user to choose between createAccount and or login
		// send userName and password to method createAccount and loginControler
		
			String user = account.get(1);
			String password = account.get(3);
			
			
			int count = 1;
			String userConsoleName;
			String userConsolePassword;
			System.out.println("\nLogin:");

			System.out.println("\nEnter User Name : ");
			userConsoleName = reader.next();
		
			System.out.println("\nEnter Password : ");
			userConsolePassword = reader.next();
		
			while (count < 4){
			
			
		}
		
		return false;
		}
		
		
}
