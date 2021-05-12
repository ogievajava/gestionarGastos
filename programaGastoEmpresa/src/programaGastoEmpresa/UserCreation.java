package programaGastoEmpresa;

public class UserCreation {
	
	private static String createPassword;

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
	
		createPassword = null;
		
		int blank = createPassword.indexOf("");
		createPassword.substring(0, blank);

		return createPassword();
		}

		public static void printUserAccount(String user, String email, String password) {


		System.out.println("User Account: ");
		System.out.println("User : " + user);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);

	}

	
}
