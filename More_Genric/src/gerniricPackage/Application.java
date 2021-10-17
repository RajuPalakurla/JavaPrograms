package gerniricPackage;

import java.util.*;



public class Application {

	public static void main(String[] args) {
		Container<Integer, String> item1 = new Container<>(100, "RaJu Palakurla");
		item1.setValue1(200);
		item1.pirntValues();
		
		Set<String> set=new HashSet<>();
		set.add("Computer");
		set.add("ABBSJ");
		set.add("sdsds");
		set.add("duyer");
		
		Set<String> set1=new HashSet<>();
		set.add("Computer");
		set.add("ABBSJ1");
		set.add("sdsds1");
		set.add("duyer1");
		Set<String> resultSet = union(set, set1);
		List<String> list=new LinkedList<>(resultSet);
		Collections.sort(list);
		System.out.println(list);
		
		Set<Integer> set3=new HashSet<>();
		set3.add(20);
		set3.add(2);
		set3.add(23);
		set3.add(45);
		
		Set<Integer> set4=new HashSet<>();
		set4.add(12);
		set4.add(1);
		set4.add(2);
		set4.add(20);
		Set<Integer> resultSet2 = union(set3, set4);
		List<Integer> list2=new LinkedList<>(resultSet2);
		Collections.sort(list2);
		System.out.println(list2);
		
	}
	public static <E> Set<E> union(Set<E> set1,Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

}
