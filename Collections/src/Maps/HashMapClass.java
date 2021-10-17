package Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("RajuPalakurla", "He is woring in TCS");
		hashMap.put("ABC", "Working in HCL");
		hashMap.put("Sammp", "Student B.E.D");
		hashMap.put("Sai", "Student M.C.A");
		hashMap.put("Yad", "She is House wife");
		hashMap.put("Kat", "Working as a agriculture");
		Collections.synchronizedMap(hashMap);
		System.out.println("Retrieve values from HashMap");
		for (Entry<String, String> entryhashMap : hashMap.entrySet()) {
			System.out.print(entryhashMap.getKey()+" : ");
			System.out.println(entryhashMap.getValue());
		}
		
		// to maintain order
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("RajuPalakurla", "He is woring in TCS");
		treeMap.put("ABC", "Working in HCL");
		treeMap.put("Sammp", "Student B.E.D");
		treeMap.put("Sai", "Student M.C.A");
		treeMap.put("Yad", "She is House wife");
		treeMap.put("Kat", "Working as a agriculture");
		
		Collections.synchronizedMap(treeMap);
		System.out.println("\n\nRetrieve values from Tree Map");
		for (Entry<String, String> entryTreeMap : treeMap.entrySet()) {
			System.out.print(entryTreeMap.getKey()+" : ");
			System.out.println(entryTreeMap.getValue());
		}
	}
}