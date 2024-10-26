public class Account{
	private int AccountNumber;
	private String AccountHolderName;
	private double Balance;
	
	public Account(){
	System.out.println("Empty cons");}
	
	public Account(int AN, String AHN,double balance){
		AccountNumber=AN;
		AccountHolderName=AHN;
	    this.Balance=balance;}
		
	public void setaccountNumber(int AN)
	{
		AccountNumber=AN;
	}
	public void setaccountHolderName(String AHN)
	{
		AccountHolderName=AHN;
	}
	public void setBalance(double balance)
	{
		this.Balance=balance;
	}
	public int getaccountNumber()
	{
		return AccountNumber;
	}
	public String getaccountHolderName()
	{
		return AccountHolderName;
	}
	public double getBalance()
	{
		return Balance;
	}
	
	public void showDetails()
	{
		System.out.println("Account Number: "+AccountNumber);
		System.out.println("Account Holder Name: "+AccountHolderName);
		System.out.println("Balance: "+Balance);
	}
}