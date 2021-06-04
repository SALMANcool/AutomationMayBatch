package thisAndSuperKeywords;

public class StudentFromConstructorLevel {
	int id;
	String name;
	public StudentFromConstructorLevel()
	{
		System.out.println("Default constructor is invoked");
		// StudentFromConstructorLevel(int id,String name);
	}

	
	public  StudentFromConstructorLevel(int id,String name)
	{
		this();//constructor level
		this.id=id;//variable level
		this.name=name;//variable level
		System.out.println("id is"+id);
		System.out.println("name  is"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentFromConstructorLevel student=new StudentFromConstructorLevel(10,"salman");
	}

}
