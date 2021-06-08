package messagePassing;

public class Person {
	
		String name="praveen";
		double adharnumber=97903953;
		String state="Andhra pradesh";
void m1()
{
	Person p=new Person();
	Vehicle v=new Vehicle();
	v.m1(p);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.m1();
	}

}
