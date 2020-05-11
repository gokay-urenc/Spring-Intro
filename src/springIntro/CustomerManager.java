package springIntro;

public class CustomerManager implements ICustomerManager {
	
	private ICustomerDal customerDal;

	// Constructor_Injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	// Setter_Injection
	/*
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	*/
	
	public void add() {
		customerDal.add();
	}
}