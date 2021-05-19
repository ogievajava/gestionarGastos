package programaGastoEmpresa;

import java.util.Random;

public class Utils {
	
	public static int createIntRandom(int top) {
		
		Random rand = new Random();
		int intRandom = rand.nextInt(top);
		
		return intRandom;

	}

	public static char createCharRandom() {
		
		String alphabetChars3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/+/";
		char charRandom = alphabetChars3.charAt(createIntRandom(alphabetChars3.length()));
        
		return charRandom;

	}

	public static String fromStringToUser(String account) {

		int dash = account.indexOf("-");
		String user = account.substring(0, dash);

		return user;
	}

	public static String fromStringToPassword(String account) {

		int firstDash = account.indexOf("-");
		int secondDash = account.indexOf("-", firstDash + 1);

		String password = account.substring(secondDash + 1, account.length());

		return password;
	}

}
