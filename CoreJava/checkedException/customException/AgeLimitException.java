package customException;

public class AgeLimitException extends Exception{
	String msg="age should be more than 18";
	
	public AgeLimitException() {
	}
	
	AgeLimitException(String msg)
	{
		this.msg=msg;
	}
	
	String getmessage()
	{
		return this.msg;
	}
}
