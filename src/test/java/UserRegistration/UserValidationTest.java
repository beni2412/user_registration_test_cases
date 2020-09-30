package UserRegistration;

import org.junit.Test;
import org.junit.Assert;

public class UserValidationTest {
		    
		 @Test
		    public void givenFirstName_Proper_ReturnTrue() {
		        UserValidation user = new UserValidation();
		        boolean result = user.firstNameValidation("Hardaman");
		        Assert.assertTrue(true);
		    }
		 @Test
		    public void givenFirstName_Improper_ReturnFalse() {
			 UserValidation user = new UserValidation();
		        boolean result = user.firstNameValidation("hardaman");
		        Assert.assertFalse(false);
		    }
		 @Test
		    public void givenLastName_Proper_ReturnTrue() {
			 UserValidation user = new UserValidation();
		        boolean result = user.lastNameValidation("Benipal");
		        Assert.assertTrue(true);
		    }
		 @Test
		    public void givenLastName_Improper_ReturnFalse() {
			 UserValidation user = new UserValidation();
		        boolean result = user.lastNameValidation("benipal");
		        Assert.assertFalse(false);
		    }
		 @Test
		    public void givenEmail_Proper_ReturnTruee() {
			 UserValidation user = new UserValidation();
		        boolean result = user.emailIDValidation("abc@gmail.com");
		        Assert.assertTrue(true);
		    }
		 @Test
		    public void givenEmail_Improper_ReturnFalse() {
			 UserValidation user = new UserValidation();
		        boolean result = user.emailIDValidation("abcdef");
		        Assert.assertFalse(false);
		    }
		 @Test
		    public void givenPassword_Proper_ReturnTrue() {
			 UserValidation user = new UserValidation();
		        boolean result = user.passwordValidation("Abcde24@");
		        Assert.assertTrue(true);
		    }
		 @Test
		    public void givenPassword_Improper_ReturnFalse() {
			 UserValidation user = new UserValidation();
		        boolean result = user.passwordValidation("helloworld");
		        Assert.assertFalse(false);
		    }
		 @Test
		    public void givenMobileNo_Proper_ReturnTrue() {
			 UserValidation user = new UserValidation();
		        boolean result = user.phoneNumberValidation("91 1234567895");
		        Assert.assertTrue(true);
		    }
		 @Test
		    public void givenMobileNo_Improper_ReturnFalse() {
			 UserValidation user = new UserValidation();
		        boolean result = user.phoneNumberValidation("12345");
		        Assert.assertFalse(false);
		    }
	
}
