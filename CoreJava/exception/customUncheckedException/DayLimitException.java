package customUncheckedException;

public class DayLimitException extends RuntimeException {
	String msg="Exceeds day limit";

	public DayLimitException() {
		super();
	}

	public DayLimitException(String msg) {
		super();
		this.msg = msg;
	}
	
	String getmessage() {
		return msg;
	}
}
