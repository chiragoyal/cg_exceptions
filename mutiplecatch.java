class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try
		{
		System.out.println("World!");
		System.out.println(10/0);
		System.out.println("Hi");
		}
		catch (ArithmeticException e)
		{
		System.out.println("Hello!");
		}
		finally
		{
        System.out.println("Hey");
        }
	}
}