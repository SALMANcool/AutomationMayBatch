package abstractionConcepts;

public abstract class Bank { //abstract  class
	public void getBankDetails()//implemented methods
	{
		System.out.println("I am from sbi bank");
		
	}
	public abstract  int  getRateOfIntrestsbi();//unimplemented method
	
	public void getBankDetailsoficici()//implemented methods
	{
		
		System.out.println("i am from icici bank");
	}
	public static void main(String[] args) {
		Bank bank=new SBIBank();//dynamic binding concept
		bank.getBankDetails();
	}

}
