package userSide;

public class Nagad extends Account{
	public Nagad(String userName, String userPhoneNo, String userPin) {
		super(userName, userPhoneNo, userPin);
		this.setInterest(10);//10% transaction interest
	}
	
	//test override
	public void systemName() {
		System.out.println("\nThis is Nagad system.");
	}
	
}
