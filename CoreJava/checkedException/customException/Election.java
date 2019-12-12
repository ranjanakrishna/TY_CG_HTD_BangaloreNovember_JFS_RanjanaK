package customException;

public class Election {
	void vote(int age) throws AgeLimitException
	{
		if(age<18)
		{
//			throw new AgeLimitException("not eligible");
			throw new AgeLimitException();
		}
		else
		{
			System.out.println("allowed for voting");
		}
	}
}
