package ArrayLinkedList2;

public class Vehicle {
	String vehiclenameString;
	int price;
	Boolean fourwheel;
	
	
	
	@Override
	public String toString() {
		return "Vehicle [vehiclenameString=" + vehiclenameString + ", price=" + price + ", fourwheel=" + fourwheel
				+ "]";
	}

	public Vehicle(String vehiclenameString, int price, Boolean fourwheel) {
		super();
		this.vehiclenameString = vehiclenameString;
		this.price = price;
		this.fourwheel = fourwheel;
	}
	
	public String getVehiclenameString() {
		return vehiclenameString;
	}
	public void setVehiclenameString(String vehiclenameString) {
		this.vehiclenameString = vehiclenameString;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Boolean getFourwheel() {
		return fourwheel;
	}
	public void setFourwheel(Boolean fourwheel) {
		this.fourwheel = fourwheel;
	}
}
