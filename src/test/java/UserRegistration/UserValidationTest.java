package UserRegistration;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;

public class UserValidationTest {
		    
		 @Test
		    public void givenFirstName_Proper_ReturnTrue() {
		        boolean found =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					
		        	Validator validateFirstName = (n) -> n.matches("^[A-Z]{1}[a-z]{2,}");
					found = validateFirstName.validate("Hardaman");
		        	
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertTrue(found);
		    }
		 @Test
		    public void givenFirstName_Improper_ReturnFalse() {
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);

					Validator validateFirstName = (n) -> n.matches("^[A-Z]{1}[a-z]{2,}");
					result = validateFirstName.validate("hardaman");
					
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertFalse(result);
		    }
		 @Test
		    public void givenLastName_Proper_ReturnTrue() {
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);

					Validator validateLastName = (n) -> n.matches("^[A-Z]{1}[a-z]{2,}");
					result = validateLastName.validate("Benipal");
					
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertTrue(result);
		    }
		 @Test
		    public void givenLastName_Improper_ReturnFalse() {
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					
					Validator validateLastName = (n) -> n.matches("^[A-Z]{1}[a-z]{2,}");
					result = validateLastName.validate("benipal");
					
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertFalse(result);
		    }
		 @Test
		    public void givenEmail_Proper_ReturnTruee() {
			boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					
					Validator validateEmail = (n) -> n.matches("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$");
					result = validateEmail.validate("abc@gmail.com");
					
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertTrue(result);
		    }
		 @Test
		    public void givenEmail_Improper_ReturnFalse() {
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					
					Validator validateEmail = (n) -> n.matches("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$");
					result = validateEmail.validate("abcdef");
	
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertFalse(result);
		    }
		 @Test
		    public void givenPassword_Proper_ReturnTrue() {
			 boolean result =false;
			 
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					
					Validator validatePassword = (n) -> n.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%]).{8,}");
					result = validatePassword.validate("Abcde24@");
					
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertTrue(result);
		    }
		 @Test
		    public void givenPassword_Improper_ReturnFalse() {
			 boolean result =false;
			 
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					
					Validator validatePassword = (n) -> n.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%]).{8,}");
					result = validatePassword.validate("helloworld");
					
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertFalse(result);
		    }
		 @Test
		    public void givenMobileNo_Proper_ReturnTrue() {
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					
					Validator validatePhone = (n) -> n.matches("^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}");
					result = validatePhone.validate("91 1234567895");
					
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertTrue(result);
		    }
		 @Test
		    public void givenMobileNo_Improper_ReturnFalse() {
			 boolean result =false;
		        try {
		        	ExpectedException exceptionRule = ExpectedException.none();
					exceptionRule.expect(UserValidationException.class);
					
					Validator validatePhone = (n) -> n.matches("^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}");
					result = validatePhone.validate("12345");
					
				} catch (UserValidationException e) {
					e.printStackTrace();
				}
		        Assert.assertFalse(result);
		    }
	
}
