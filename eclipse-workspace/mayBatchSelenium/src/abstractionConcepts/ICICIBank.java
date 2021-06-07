package abstractionConcepts;

public class ICICIBank extends Bank {
	
	public int  getRateOfIntrest()
	{
		
		System.out.println("housing loan is of 10% in Icici bank");
		return 10;
	}
	
	public static void main(String[] args)
	{ICICIBank icici=new ICICIBank();
	icici.getRateOfIntrest();
		
	}
}
