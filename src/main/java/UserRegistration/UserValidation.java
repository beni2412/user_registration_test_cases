package UserRegistration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserValidation {

	public static boolean firstNameValidation(String fname) {
		Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher(fname);
		boolean matchfound = matcher.find();
		if(matchfound) 
			return true;
		else 
			return false;
	}
	
	public static boolean lastNameValidation(String lname) {
		Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher(lname);
		boolean matchfound = matcher.find();
		if(matchfound) 
			return true;
		else 
			return false;
	}
	
	public static boolean emailIDValidation(String emailid) {
		Pattern pattern =Pattern.compile("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\\\.[a-z]{2,}){1,2}");
		Matcher matcher = pattern.matcher(emailid);
		boolean matchfound = matcher.find();
		if(matchfound) 
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to User Registration");
		for(int i=0;;) {
			boolean found = false;
			System.out.println("Enter first name (Start with capital):");
			String firstName = sc.nextLine();
			found = firstNameValidation(firstName);
			if(found) {
				break;
			}
			else
				System.out.println("Invalid name (Start with capital and should have min 3 charcaters");
		}
		for(int i=0;;) {
			boolean found = false;
			System.out.println("Enter last name (Start with capital):");
			String lastName = sc.nextLine();
			found = firstNameValidation(lastName);
			if(found) {
				break;
			}
			else
				System.out.println("Invalid name (Start with capital and should have min 3 charcaters");
		}
		
		for(int i=0;;) {
			boolean found = false;
			System.out.println("Enter email ID:");
			String email = sc.nextLine();
			found = firstNameValidation(email);
			if(found) {
				System.out.println("Correct input");
				break;
			}
			else
				System.out.println("Invalid email");
		}
	}
}
