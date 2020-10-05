package UserRegistration;

public interface Validator {

	boolean validate(String value) throws UserValidationException;

}
