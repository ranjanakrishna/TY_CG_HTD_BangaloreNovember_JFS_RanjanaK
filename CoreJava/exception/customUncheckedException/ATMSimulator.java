package customUncheckedException;

public class ATMSimulator {
	void withdraw(double amount)
	{
		if(amount>40000)
		{
			throw new DayLimitException();
			//throw new DayLimitException("user exceeds day limit");
		}
	}
}
