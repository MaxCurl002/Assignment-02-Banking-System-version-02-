package userSide;

public class Transactions {
	public void interfaces() {
	//Bkash
		Bkash bkash_1 = new Bkash("Abhijit Paul", "01968399154", "1201");
		bkash_1.systemName();//method overriding
		System.out.println(bkash_1.showBalance());
		bkash_1.addMoney("01968399154", "1200", 75000);//error case handling
		bkash_1.addMoney("01968399154", "1201", 75000);//inheritance 
		bkash_1.cashOut("01968399154", "1201", 10000);//inheritance
		System.out.println(bkash_1.showBalance());
		bkash_1.addMoney("01968399154", 30000);//method overloading
		System.out.println(bkash_1.showBalance());
	//Rocket	
		Rocket rocket_1 = new Rocket("Abhijit Paul", "01968399154", "1201");
		rocket_1.systemName();//method overriding
		System.out.println(rocket_1.showBalance());
		rocket_1.addMoney("01968399154", "1200", 75000);//error case handling
		rocket_1.addMoney("01968399154", "1201", 75000);//inheritance 
		bkash_1.cashOut("01968399154", "1201", 10000);//inheritance
		System.out.println(rocket_1.showBalance());
		rocket_1.addMoney("01968399154", 30000);//method overloading
		System.out.println(rocket_1.showBalance());
	//Nagad	
		Nagad nagad_1 = new Nagad("Abhijit Paul", "01968399154", "1201");
		nagad_1.systemName();//method overriding
		System.out.println(nagad_1.showBalance());
		nagad_1.addMoney("01968399154", "1200", 75000);//error case handling
		nagad_1.addMoney("01968399154", "1201", 75000);//inheritance 
		nagad_1.cashOut("01968399154", "1201", 10000);//inheritance
		System.out.println(nagad_1.showBalance());
		nagad_1.addMoney("01968399154", 30000);//method overloading
		System.out.println(nagad_1.showBalance());
		
	}
	
	
}
