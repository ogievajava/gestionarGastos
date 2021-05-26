package programaGastoEmpresa;

import java.util.ArrayList;

//Clase Users - Crearemos un Array de objetos User, Parquing de "User";

public class Users {

	public static void usersList(String name, String password, String email, String expense) {

		ArrayList<String> user = new ArrayList<String>();

		user.add(name);
		user.add(password);
		user.add(email);
		user.add(expense);

	}

}