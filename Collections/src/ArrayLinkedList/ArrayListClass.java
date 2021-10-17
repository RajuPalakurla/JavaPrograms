package ArrayLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

import com.sun.tools.javac.util.List;

public class ArrayListClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList arrayList=new ArrayList();
		arrayList.add("Raju Palakurla");
		arrayList.add(10);
		arrayList.add('A');
		arrayList.add(2.1);
		arrayList.add(20);
		arrayList.add(40.1223);
		String str= (String)arrayList.get(0);
		int val= (int)arrayList.get(1);
		double dvla= (double)arrayList.get(3);
		System.out.println("String vale :"+str+"Integere value: "+val+" Double value : "+dvla);
		arrayList.remove(0);
		System.out.println("Dispalzying arraylist value ");
		for (int i = 0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		ArrayList<Integer> objArrayList = new ArrayList<>();
		objArrayList.add(10);
		objArrayList.add(30);
		objArrayList.add(20);
		
		System.out.println("Dispalzying Integer arraylist value ");
		for (int intel:objArrayList) {
			System.out.println(intel);
		}
		
		LinkedList<Integer> linkobj=new LinkedList<>();
		linkobj.add(40);
		linkobj.add(60);
		linkobj.add(50);
		linkobj.add(70);
		linkobj.add(80);
		linkobj.add(90);
		linkobj.remove();
		linkobj.removeFirst();
		linkobj.addFirst(10000);
		
		System.out.println("Dispalzying Integer LInkedList value ");
		for (int intel : linkobj) {
			System.out.println(intel);
		}
	}
	
	

}
