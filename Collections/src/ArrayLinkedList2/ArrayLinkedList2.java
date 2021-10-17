package ArrayLinkedList2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedList2 {

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles;
		vehicles = new ArrayList<>();
		Vehicle firstVehicle = new Vehicle("Honda",12000,false);
		Vehicle secondVehicle = new Vehicle("splender",11000,false);
		Vehicle thirdVehicle = new Vehicle("maruti",13000,true);
		Vehicle fourthVehicle = new Vehicle("suzki",15000,true);
		vehicles.add(firstVehicle);
		vehicles.add(secondVehicle);
		vehicles.add(thirdVehicle);
		vehicles.add(fourthVehicle);
		System.out.println("Vehicle list from arrayList object");
		displayValues(vehicles);
		
		LinkedList<Vehicle> newvehicles;
		newvehicles = new LinkedList<>();
		Vehicle sVehicle = new Vehicle("AAdi",22000,true);
		Vehicle s5Vehicle = new Vehicle("Benz",21000,true);
		Vehicle s6Vehicle = new Vehicle("i20",23000,true);
		Vehicle s7Vehicle = new Vehicle("asas",25000,true);
		newvehicles.add(sVehicle);
		newvehicles.add(s5Vehicle);
		newvehicles.add(s6Vehicle);
		newvehicles.add(s7Vehicle);
		
		System.out.println("Vehicle list from LinkedList object");
		displayValues(newvehicles);

	}
	public static void displayValues(List<Vehicle> obj) {
		
		for (Vehicle vehicle : obj) {
			System.out.println(vehicle);
		}
	}

}
