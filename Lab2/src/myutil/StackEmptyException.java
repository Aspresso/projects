package myutil;

public class StackEmptyException extends Exception {

	private String message = "Fel vid körning, stacken är tom";

	public StackEmptyException() {

	}

	public String getMessage() {

		return message;

	}

}