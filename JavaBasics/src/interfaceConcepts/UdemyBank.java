package interfaceConcepts;

//We can call multiple interfaces in single class by comma separated
public class UdemyBank implements BankingClient,InvestmentClient{

	/*Now we have agreed with client that, we will implement all your methods as per your requirement.
	For that we need to use those unimplemented methods first using "implements" keyword.
	Once we implement interface, error occurs at class name, as we have agreed to implement those methods but not yet done
	So, override those methods & write implementation for all methods.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UdemyBank ub = new UdemyBank();
		ub.payCreditCardAmount(); //interface metjhods
		ub.checkBalance();
		ub.login(); //Additional method apart from interface.
		
		//There is one more concept like RUN TIME POLYMOPHISM. In this, we call class object with interface, i.e., Giving reference of child Object
		//to interface i.e like as below:-
		BankingClient bc = new UdemyBank();
		/* In this, only banking client interface methods are acceissble */
		bc.verifyTransferBalance();
	}

	@Override
	public void payCreditCardAmount() {
		// TODO Auto-generated method stub
		System.out.println("credit crad implemented");
	}

	@Override
	public void verifyTransferBalance() {
		// TODO Auto-generated method stub
		System.out.println("transfer balance implemented");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("check balance implemented");
	}
	
	//Additional methods apat from interface
	public void login()
	{
		System.out.println("LoggedIn");
	}
	
	public void logout()
	{
		System.out.println("Logged-Out");
	}

	@Override
	public void domainInvestment() {
		// TODO Auto-generated method stub
		System.out.println("Domain");
	}

	@Override
	public void generalInvestment() {
		// TODO Auto-generated method stub
		
	}
}
