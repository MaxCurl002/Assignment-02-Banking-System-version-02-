package userSide;

public class Bkash extends Account{		
	public Bkash(String userName, String userPhoneNo, String userPin) {
		super(userName, userPhoneNo, userPin);
		this.setInterest(6);//6% transaction interest
	}
	
	//test override
	public void systemName() {
		System.out.println("\nThis is Bkash system.");
	}
	
}
