package thisAndSuperKeywords;



public class Bike extends Vehicle {
	
	int speed=100;
	public void display()
	{
		System.out.println("speed of child class"+speed);
		System.out.println("speed of parent class"+super.speed);
	}
	public void m1()
	{
		super.m1();
		System.out.println("child  class method-bike");
		//System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike();
		//.display();
		bike.m1();

	}

}
