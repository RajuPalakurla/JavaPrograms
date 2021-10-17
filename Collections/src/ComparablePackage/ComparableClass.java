package ComparablePackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ComparableClass {

	public static void main(String[] args) {
		HashSet<Integer> arrayList = new HashSet();
		arrayList.add(100);
		arrayList.add(80);
		arrayList.add(20);
		arrayList.add(200);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(600);
		arrayList.add(700);
		
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(200);
		arrayList2.add(90);
		arrayList2.add(20);
		
		boolean retainval = arrayList.retainAll(arrayList2);
		System.out.println(arrayList);
		
		arrayList.addAll(arrayList2);
		System.out.println(arrayList);
		
		arrayList.removeAll(arrayList2);
		System.out.println(arrayList);
		
		arrayList.clear();
		System.out.println(arrayList);
		
		boolean hasValue = arrayList.contains(200);
		System.out.println(hasValue);
		
		arrayList.add(100);
		arrayList.add(80);
		arrayList.add(20);
		arrayList.add(200);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(600);
		arrayList.add(700);
		List<Integer> list=new ArrayList<>(arrayList);
		Collections.sort(list);
		System.out.println(list);
		
		HashSet<Employee> employees=new HashSet<>();
		Employee nEmployee=new Employee("Raju",100000,"IT");
		Employee n1Employee=new Employee("Raju",100000,"IT");
		employees.add(new Employee("Sai",200000,"Admin"));
		employees.add(new Employee("Samp",300000,"Main"));
		employees.add(new Employee("Yad",140000,"Manage"));
		employees.add(new Employee("Kat",150000,"HIgher"));
		employees.add(n1Employee);
		employees.add(nEmployee);
		
		
		System.out.println(nEmployee.equals(n1Employee));
		
		List<Employee> myList = new LinkedList<>(employees);
		Collections.sort(myList);
		//System.out.println(myList);
		for (Employee employee : myList) {
			System.out.println(employee);
		}
		
	}

}
