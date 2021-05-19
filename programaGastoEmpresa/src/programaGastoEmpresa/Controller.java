package programaGastoEmpresa;

	public class Controller {
		
		public static String createAccount(String userToCreateAccount) {
			

			String user = UserCreation.createUser(userToCreateAccount);
			String email = UserCreation.createEmail(userToCreateAccount);
			String password = UserCreation.createPassword();
			UserCreation.printUserAccount(user, email, password);
			
			String account = UserCreation.accountToString(user, email, password);
			
			return account;
		}
		
		
//		
//		public static void AppStarting() {
//
////		while (true) {
//			
//			Scanner reader = new Scanner(System.in);
//			System.out.println("Tell me your user name:");
//			String userName = reader.nextLine();
//			
//			System.out.println("Tell me your login:");
//			String userType = reader.nextLine();
//			
//			System.out.println("Tell me your password:");
//			String userPassword = reader.nextLine();
//			
//			if(equals) {
//				break;
//			} // Has creado la cuenta correcto
//			
//			//System.out.println("Tell me your amount of your buy:");
//		    //String userBuy = reader.nextLine();
//			
//			System.out.println("\nUser:");
//			System.out.println("User Name: " + userName);
//			System.out.println("User Type: " + userType);
//			System.out.println("User Password: " + userPassword);
//			
//			
//			//System.out.println("User Buy: " + userBuy);
//			
//			
//			
//			
//		}
//			
//	}

		public static void executeController() {
			// TODO Auto-generated method stub
			
		}
}
