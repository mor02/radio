package Exceptions;

public class ExceptionReseau extends Exception {

	private String message;
	

	public ExceptionReseau(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
