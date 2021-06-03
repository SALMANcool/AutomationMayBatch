package MethodOverriding;

public class Vehicle extends Person {
	
	
	public void  buyingAVehicle()
	{
	System.out.println("you are suppose to buy a bike in the child class");

	}
	
	public static void main(String[] args) {
		Vehicle veh=new Vehicle();
		veh.buyingAVehicle();
	}

}
