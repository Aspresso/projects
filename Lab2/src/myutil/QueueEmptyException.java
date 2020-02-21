package myutil;

public class QueueEmptyException extends Exception {

	private String message = "Fel vid körning, kön är tom";

	public QueueEmptyException() {
	}

	public String getMessage() {
		return message;
	}

}