package userSide;

public class Account {
	private String userName;
	private String userPhoneNo;
	private String userPin;
	private int interest_transaction;//in percentage
	private int userBalance;
	
	public Account(String userName, String userPhoneNo, String userPin) {
		this.userName=userName;
		this.userPhoneNo=userPhoneNo;
		this.userPin=userPin;
	}
	
	//set transaction interest
	public void setInterest(int interest_trx) {
		this.interest_transaction=interest_trx;
	}
	
	//cashOut and addMoney
	public void addMoney(String userPhoneNo, String userPin, int amount) {
		if(this.userPin==userPin) this.userBalance=this.userBalance+amount-amount*this.interest_transaction/100;
		else if(this.userPin!=userPin) System.out.println("Error! Wrong phone No or pin code.");
	}
	
	//use of method overload
	public void addMoney(String userPhoneNo, int amount) {
		this.userBalance=this.userBalance+amount-amount*this.interest_transaction/100;
	}
	
	public void cashOut(String userPhoneNo, String userPin, int amount) {
		if(this.userPin==userPin) {
			int x=amount+amount*this.interest_transaction/100;
			if(x<=this.userBalance) this.userBalance-=x;
			else if(amount>this.userBalance) System.out.println("Not enough balance. Your curremt balance is "+this.userBalance);
		}
		else if(this.userPin!=userPin) System.out.println("Error! Wrong phone no or pin code");
	}
	//change account password
	private boolean isPinVerified(String user_pin) {
		if(this.userPin==user_pin) return true;
		System.out.println("Wrong pin, operation denied!");
		return false;
	}
	
	public void changeAccountPassword(String old_pin, String new_pin) {
		if(isPinVerified(old_pin)) {
			this.userPin=new_pin;
			System.out.println("Pin has been updated.");
		}
	}
	//show account information
	public String showBalance() { //add pin
		return "->"+this.userName+" Phone No:"+ this.userPhoneNo+ " Balace:"+ this.userBalance;
	}
	
	//test override
	public void systemName() {
		System.out.println("This is Account system");
	}
}
	