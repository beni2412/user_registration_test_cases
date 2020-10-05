package UserRegistration;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
	
	

/*	public static boolean firstNameValidation(String fname) throws UserValidationException {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher(fname);
		boolean matchfound = matcher.find();
		if (matchfound)
			return true;
		else
			return false;
	}

	public static boolean lastNameValidation(String lname) throws UserValidationException {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher(lname);
		boolean matchfound = matcher.find();
		if (matchfound)
			return true;
		else
			return false;
	}

	public static boolean emailIDValidation(String emailid) throws UserValidationException {
		Pattern pattern = Pattern.compile("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$");
		Matcher matcher = pattern.matcher(emailid);
		boolean matchfound = matcher.find();
		if (matchfound)
			return true;
		else
			return false;
	}

	public static boolean phoneNumberValidation(String phoneNum) throws UserValidationException {
		Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}");
		Matcher matcher = pattern.matcher(phoneNum);
		boolean matchfound = matcher.find();
		if (matchfound)
			return true;
		else
			return false;
	}

	public static boolean passwordValidation(String password) throws UserValidationException {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%]).{8,}");
		Matcher matcher = pattern.matcher(password);
		boolean matchfound = matcher.find();
		if (matchfound)
			return true;
		else
			return false;
	}*/

	
	public static void main(String[] args) throws UserValidationException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to User Registration");
		for (int i = 0;;) {
			boolean found = false;
			System.out.println("Enter first name (Start with capital):");
			String firstName = sc.nextLine();
			Validator validateFirstName = (n) -> n.matches("^[A-Z]{1}[a-z]{2,}");
			found = validateFirstName.validate(firstName);
			if (found) {
				break;
			} else
				System.out.println("Invalid name (Start with capital and should have min 3 charcaters");
		}
		for (int i = 0;;) {
			boolean found = false;
			System.out.println("Enter last name (Start with capital):");
			String lastName = sc.nextLine();
			Validator validateLastName = (n) -> n.matches("^[A-Z]{1}[a-z]{2,}");
			found = validateLastName.validate(lastName);
			if (found) {
				break;
			} else
				System.out.println("Invalid name (Start with capital and should have min 3 charcaters");
		}

		for (int i = 0;;) {
			boolean found = false;
			System.out.println("Enter email ID:");
			String email = sc.nextLine();
			Validator validateEmail = (n) -> n.matches("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$");
			found = validateEmail.validate(email);
			if (found) {
				break;
			} else
				System.out.println("Invalid email");
		}

		for (int i = 0;;) {
			boolean found = false;
			System.out.println("Enter phone number:");
			String phoneNumber = sc.nextLine();
			Validator validatePhone = (n) -> n.matches("^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}");
			found = validatePhone.validate(phoneNumber);
			if (found) {
				break;
			} else
				System.out.println("Invalid phone number");
		}

		for (int i = 0;;) {
			boolean found = false;
			System.out.println("Enter password:");
			String passwrd = sc.nextLine();
			Validator validatePassword = (n) -> n.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%]).{8,}");
			found = validatePassword.validate(passwrd);
			if (found) {
				System.out.println("Registration Successful");
				break;
			} else
				System.out.println("Invalid password");
		}

	}
}
