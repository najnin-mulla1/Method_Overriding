//WAP on super()
package Package1;
class Youtube
{
	Youtube(String a, double b)
	{
		System.out.println("Youtube");
	}
}
class Google extends Youtube
{
	Google()
	{	super("Automation",4.55);
		System.out.println("Google");
	}
}
public class Amazon extends Google
{
	Amazon()
	{
		super();
		System.out.println("Amazon");
	}
public static void main(String[] args)
{
	new Amazon();
}
}
