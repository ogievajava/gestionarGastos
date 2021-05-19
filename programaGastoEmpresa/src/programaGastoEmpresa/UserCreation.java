package programaGastoEmpresa;

public class UserCreation {
	
	public static String createUser(String createUser) {

		int blank = createUser.indexOf(" ");
		String user = createUser.substring(0, blank);

		return user;
	}

	public static String createEmail(String createEmail) {
		
		int blank = createEmail.indexOf(" ");
		String surname = createEmail.substring(blank + 1, createEmail.length());
		String email = createEmail.charAt(0) + surname + "@java.com";

		return email;
	}

	public static String createPassword() {
		

		String password = "";

		password = password + Utils.createCharRandom() + Utils.createIntRandom(10000) + Utils.createCharRandom()
				+ Utils.createCharRandom() + Utils.createIntRandom(596);

		return password;
	}

	public static void printUserAccount(String user, String email, String password) {
		

		System.out.println("User Account: ");
		System.out.println("User : " + user);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);

	}

	public static String accountToString(String user, String email, String password) {

		String accountToString = user + "-" + email + "-" + password;

		return accountToString;

	}
	
		//System.out.println("User Buy: " + userBuy);

}

