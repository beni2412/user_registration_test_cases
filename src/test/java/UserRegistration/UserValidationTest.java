package UserRegistration;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;

public class UserValidationTest {
		    
		 @Test
		    public void givenFirstName_Proper_ReturnTrue() {
		        UserValidation user = new UserValidation();
		        boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					result = user.firstNameValidation("Hardaman");
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertTrue(result);
		    }
		 @Test
		    public void givenFirstName_Improper_ReturnFalse() {
			 UserValidation user = new UserValidation();
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					result = user.firstNameValidation("hardaman");
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertFalse(result);
		    }
		 @Test
		    public void givenLastName_Proper_ReturnTrue() {
			 UserValidation user = new UserValidation();
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					result = user.lastNameValidation("Benipal");
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertTrue(result);
		    }
		 @Test
		    public void givenLastName_Improper_ReturnFalse() {
			 UserValidation user = new UserValidation();
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					result = user.lastNameValidation("benipal");
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertFalse(result);
		    }
		 @Test
		    public void givenEmail_Proper_ReturnTruee() {
			 UserValidation user = new UserValidation();
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					result = user.emailIDValidation("abc@gmail.com");
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertTrue(result);
		    }
		 @Test
		    public void givenEmail_Improper_ReturnFalse() {
			 UserValidation user = new UserValidation();
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					result = user.emailIDValidation("abcdef");
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertFalse(result);
		    }
		 @Test
		    public void givenPassword_Proper_ReturnTrue() {
			 UserValidation user = new UserValidation();
			 boolean result =false;
			 
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					result = user.passwordValidation("Abcde24@");
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertTrue(result);
		    }
		 @Test
		    public void givenPassword_Improper_ReturnFalse() {
			 UserValidation user = new UserValidation();
			 boolean result =false;
			 
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					result = user.passwordValidation("helloworld");
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertFalse(result);
		    }
		 @Test
		    public void givenMobileNo_Proper_ReturnTrue() {
			 UserValidation user = new UserValidation();
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					result = user.phoneNumberValidation("91 1234567895");
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertTrue(result);
		    }
		 @Test
		    public void givenMobileNo_Improper_ReturnFalse() {
			 UserValidation user = new UserValidation();
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					result = user.phoneNumberValidation("12345");
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertFalse(result);
		    }
	
}
