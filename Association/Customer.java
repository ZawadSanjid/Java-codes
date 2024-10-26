public class Customer{
	private int nid;
	private String name;
	private Account account;
	
	public Customer(){
	System.out.println("Empty cons");}
	
	public Customer(int nid, String name,Account account){
		this.name=name;
		this.nid=nid;
	    this.account=account;}
		
	public void setNid(int nid)
	{
		this.nid=nid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAccount(Account account)
	{
		this.account=account;
	}
	public int getNid()
	{
		return nid;
	}
	public String getName()
	{
		return name;
	}
	public Account getAccount()
	{
		return account;
	}
	
	public void Showdetails(){
		System.out.println("Name: "+name);
		System.out.println("Nid: "+nid);
		account.showDetails();	}

}		/*System.out.println("Account Number: "+AccountNumber);
		System.out.println("Account Holder Name: "+AccountHolderName);
		System.out.println("Balance: "+Balance);
		System.out.println("Account Number:"+account.getaccountNumber());
		System.out.println("Account Holder Name:"+account.getaccountHolderName());
		System.out.println("Balance:"+account.getBalance());*/