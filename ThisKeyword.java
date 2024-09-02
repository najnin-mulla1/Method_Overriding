//WAP on ThisKeyword
package Package1;
public class ThisKeyword 
{
int age;
String name;
double salary;
void details(int age,String name,double salary)
{
	this.age=age;
	this.name=name;
	this.salary=salary;
}
public static void main(String[] args)
{
	ThisKeyword t=new ThisKeyword();
	t.details(25, "Aafia", 90534.16);
	System.out.println(t.age);
	System.out.println(t.name);
	System.out.println(t.salary);
}
}
