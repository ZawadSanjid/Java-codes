public class Start
{
	public static void main(String[] args)
	{
	Account a1=new Account(111,"Alan",100);
	Account a2=new Account(112,"Alex",200);
	
	Customer c1=new Customer();
	Customer c2=new Customer();
	
	c1.setName("asd");
	c1.setNid(1234);
	c1.setAccount(a1);
	c1.Showdetails();
	
	c2.setName("zxc");
	c2.setNid(5678);
	c2.setAccount(a2);
	c2.Showdetails();
	//c1.showDetails();
	
	/*System.out.println("Name:"+c1.getName());
	System.out.println("NID:"+c1.getNid());
	System.out.println("Account number:"+c1.getAccount().getaccountNumber());
	System.out.println("Account Holder Name:"+c1.getAccount().getaccountHolderName());
	System.out.println("Balance:"+c1.getAccount().getBalance());
	
	System.out.println("----------------------------");
	System.out.println("----------------------------");
	
	System.out.println("Name:"+c2.getName());
	System.out.println("NID:"+c2.getNid());
	System.out.println("Account number:"+c2.getAccount().getaccountNumber());
	System.out.println("Account Holder Name:"+c2.getAccount().getaccountHolderName());
	System.out.println("Balance:"+c2.getAccount().getBalance());*/
	}
}