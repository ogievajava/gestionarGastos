package programaGastoEmpresa;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		
		System.out.println("Welcome to gastos generation program");
		
		System.out.println("Type user (name and surname) to create Account ...");
		
		Scanner reader;
		String userToCreateAccount = reader.nextLine();
		
		String account = UserCreation.createUser(userToCreateAccount);
			
		String user = Utils.fromStringToUser (account);
		String password = Utils.fromStringToPassword (account);
		
		
		Scanner reader;
		boolean  isValidated  =  Login.validateAccount (reader, user, password);
		
		
		if (isValidated) {
			
			isValidated = false;
		}
		
		System.out.println("Bye Bye and thanks for visit");
		reader.close();

	}

}
