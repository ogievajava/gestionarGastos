package usercreation;

import java.util.ArrayList;

import object.User;

public class Users {

	public static User getValidatedUser(ArrayList<User> users) {

		
		int index = 0;
		for (User user : users) {

			if (user.isValidated)
				return  users.get(index);
			index++;
		}

		return null;
	}

}