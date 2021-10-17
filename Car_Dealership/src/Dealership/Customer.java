package Dealership;

public class Customer {
	String sName;
	String sAddress;
	int iCashOnHand;
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public int getiCashOnHand() {
		return iCashOnHand;
	}
	public void setiCashOnHand(int iCashOnHand) {
		this.iCashOnHand = iCashOnHand;
	}

	public void purchaseCar(Vehicle vehicle,Employee employee,int cashonhand) {
		
	}
	
}
