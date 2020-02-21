package myutil;

public class ListBoundaryException extends Exception {

	private String message = "Fel vid körning, out of bounds";

	public ListBoundaryException() {
	}

	public String getMessage() {
		return message;
	}

}
