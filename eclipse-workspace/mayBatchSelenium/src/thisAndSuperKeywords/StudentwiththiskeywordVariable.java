package thisAndSuperKeywords;

public class StudentwiththiskeywordVariable {
	int id;
	String name;
	
	public StudentwiththiskeywordVariable(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println(id +"   "+name);
	}
	public static void main(String[] args) {
		
		StudentwiththiskeywordVariable stud=new StudentwiththiskeywordVariable(10,"salman");
		stud.display();
		
	}
}

