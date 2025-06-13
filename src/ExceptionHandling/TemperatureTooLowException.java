package ExceptionHandling;

public class TemperatureTooLowException extends Exception {
	public TemperatureTooLowException(String message) {
		super(message);
	}
}
