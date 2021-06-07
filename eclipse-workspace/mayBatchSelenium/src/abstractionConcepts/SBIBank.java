package abstractionConcepts;

public class SBIBank extends Bank {
	
	public int getRateOfIntrestsbi() {
		// TODO Auto-generated method stub
		System.out.println("housing loan is of 7% in sbi bank");
		return 7;
	}
	
	public void accountdetailsOfCustomer()
	{
		System.out.println("account class of sbi bank");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	SBIBank sbi=new SBIBank();
//		sbi.getRateOfIntrest();
//		sbi.accountdetailsOfCustomer();
//		sbi.getBankDetails();

		Bank bank=new SBIBank();//dynamic binding concept
		bank.getBankDetails();
		
		
	}
	
	

}
