package gerniricPackage;

import java.util.ArrayList;

import jdk.javadoc.internal.doclets.toolkit.WorkArounds;

public class Application2 {

	public static void main(String[] args) {
		
		Employee employee0=new Employee();
		Accountant accountant0=new Accountant();
		employee0=accountant0;
		
		//Strictly type checking this is generic limitations
		ArrayList<Employee> employees1 = new ArrayList<>();
		employees1.add(new Employee());
		ArrayList<Accountant> accountants1 = new ArrayList<>();
		accountants1.add(new Accountant());
//		employees1=accountants1;
		
		//Unknow (Object)
		ArrayList<?> emp=new ArrayList<>();
		ArrayList<Accountant> acct=new ArrayList<>();
		emp=acct;
		
		
		//Upper bound (All child class instance can be stored in parent class object)
		ArrayList<? extends Employee> employees2=new ArrayList<>();
		ArrayList<Accountant> accountants2=new ArrayList<>();
		employees2=accountants2;
		
		
		ArrayList<? extends Employee> employees3=new ArrayList<>();
		ArrayList<HRManagement> accountants3=new ArrayList<>();
		accountants3.add(new HRManagement());
		employees3=accountants3;
		
		//Lower bound (All Parent class instance can be stored in Child class object)
		ArrayList<? super Employee> employees4=new ArrayList<>();
		ArrayList<Accountant> accountants4= new ArrayList<>();
		ArrayList<Object> accountants5= new ArrayList<>();
		employees4=accountants5;
		workArea(employees3);
		//workArea2(accountants4);

	}

	public static void workArea(ArrayList<? extends Employee> employees) {
		for (Employee employee :  employees) {
			employee.work();
		}
	}
}
