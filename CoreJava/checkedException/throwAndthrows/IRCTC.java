package throwAndthrows;

public class IRCTC {
	void confirmTicket() throws ClassNotFoundException
	{
		try
		{
			//Class.forName("Paytm");
			Class.forName("throwAndthrows.Paytm");
			System.out.println("ticket is confirmed");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("ticket is not confirmed");
			throw e;
		}
	}
}
