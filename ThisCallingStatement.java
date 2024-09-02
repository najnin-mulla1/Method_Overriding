//WAP on this()
package Package1;
public class ThisCallingStatement
{
	ThisCallingStatement(int i)
	{
		System.out.println("integer this()");
	}
	ThisCallingStatement(double d)
	{
		this(23);
		System.out.println("double this()");
	}
	ThisCallingStatement()
	{
		this(456.234);
		System.out.println("Non-parameters");
	}
	public static void main(String[] args)
	{
		new ThisCallingStatement();
	}
}
