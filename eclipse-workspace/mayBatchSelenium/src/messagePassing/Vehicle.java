package messagePassing;

public class Vehicle {
	
	String vehicleName="pulasar";
	int model=2021;
	String enginecapacity="150cc";
	
	public void m1(Person p)
	{
		System.out.println(p.adharnumber);
		System.out.println(p.name);
		System.out.println(p.state);
		System.out.println(model);
		System.out.println(enginecapacity);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle veh=new Vehicle();
		//veh.m1(p);

	}

}
