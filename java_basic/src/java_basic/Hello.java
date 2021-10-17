package java_basic;

import someotherpackage.Operation;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello there, i am Raju Palakurla");
		textfunc();
		System.out.println("Sum is from utils calss is :"+Utils.sum2(10,20));
		System.out.println("Sum is from someother package : "+Operation.accessPackage());
		Operation varOP;
		varOP = new Operation();
		System.out.println("Non static method sum :"+varOP.sum3(10,20,30));
	}
	
	public static void textfunc() {
		System.out.println("hey Raju watsap");
	}

}
