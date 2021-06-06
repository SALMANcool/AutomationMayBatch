package relationShipConcepts;

public class Vehicle  {
	//global variable
	//public Person person1=new Person();
String vehicleName="pulasar";
int model=2021;
String enginecapacity="150cc";

public void buyingAVehicle()
{
	System.out.println(vehicleName);
	System.out.println(model);
	System.out.println(enginecapacity);	
//	person1.getDetails();
		
}
public void buyingAVehicleUsesARel()
{Person person1=new Person();
	System.out.println(vehicleName);
	System.out.println(model);
	System.out.println(enginecapacity);	
	person1.getDetails();
		
}
public static void main(String[] args) {
	Vehicle veh=new Vehicle();
	//veh.getDetails();
	//Sysoperson.
	//veh.buyingAVehicle();
	veh.buyingAVehicleUsesARel();

}
}
