package userSide;

public class Rocket extends Account{
	public Rocket(String userName, String userPhoneNo, String userPin) {
		super(userName, userPhoneNo, userPin);
		this.setInterest(4);//4% transaction interest
	}
	
	//test override
	public void systemName() {
		System.out.println("\nThis is Rocket system.");
	}
	
}

