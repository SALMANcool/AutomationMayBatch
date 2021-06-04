package thisAndSuperKeywords;

public class StudentWithoutThisKeyword {

	
		int id;
		String name;
		
		public StudentWithoutThisKeyword(int id,String name)
		{
			id=id;
			name=name;
		}
		
		public void display()
		{
			System.out.println(id +"   "+name);
		}
		public static void main(String[] args) {
			
			StudentWithoutThisKeyword stud=new StudentWithoutThisKeyword(10,"salman");
			stud.display();
			
		}
	}

