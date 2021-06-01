package programaGastoEmpresa;

import java.util.ArrayList;

//Clase Users - Crearemos un Array de objetos User, Parquing de "User";

public class Users {
	
	static ArrayList<User> users = null;
	
	public static void usersList(User user) {
		
		users = new ArrayList<User>();

		users.add(user);

	}

}