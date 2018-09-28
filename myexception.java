class TooYoungException extends RuntimeException 
{
	TooYoungException(String s)
	{
		super(s);
	}
}
	class TooOldException extends RuntimeException
	{
		TooOldException(String s)
		{
			super(s);
		}
	}
	class Test extends RuntimeException
	{
	public static void main(String[] args) 
	{
		int age=Integer.parseInt(args[0]);
			if(age<21)
		{
			throw new TooYoungException("age expired");
		}
		else if(age>59)
		{
         throw new TooOldException("very early");
		}
		else
		{
         System.out.println("marry me");
	}
}
}
