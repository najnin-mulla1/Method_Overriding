//WAP on methodoverriding using Super keyword
package Package1;
class parent
{void login()
	{
	System.out.println("Login with email id");
	}
	
}

public class MethodOverriding extends parent {
	void login()
	{	
		super.login();
		System.out.println("Login with Mobile no");
	
	}
public static void main(String[] args)
{
	
	MethodOverriding m1=new MethodOverriding();
	m1.login();

}
}
