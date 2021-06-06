package Encapsulation;

public class Vehicle {
	
	public void pulsarDetails()
	{
	String vehicleName="pulasar";
	int model=2021;
	String enginecapacity="150cc";
	}
	public void enfieldDetails()
	{
	String vehicleName="enfield";
	int model=2021;
	String enginecapacity="225cc";
	}
	public void jupoterDetails()
	{
		String vehicleName="jupiter";
		int model=2021;
		String enginecapacity="125cc";
		System.out.println(vehicleName);
		System.out.println(model);
		System.out.println(enginecapacity);
	}
	
	public static void main(String[] args) {
		Vehicle veh=new Vehicle();
		veh.jupoterDetails();
}
}
