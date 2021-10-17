package HasSetPacakge;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<Animal> animal = new HashSet<>();
		Animal animal1=new Animal("Bird", 1);
		Animal animal2=new Animal("Duck", 2);
		Animal animal3=new Animal("Horse", 20);
		Animal animal4=new Animal("Lion", 26);
		Animal animal5=new Animal("Tiger",15);
		Animal animal6=new Animal("Duck", 2);
		Animal animal7=new Animal("Duck", 2);
		Animal animal8=new Animal("Tiger", 25);
		animal.add(animal1);
		animal.add(animal2);
		animal.add(animal3);
		animal.add(animal4);
		animal.add(animal5);
		animal.add(animal6);
		animal.add(animal7);
		animal.add(animal8);
		
		for (Animal animalele : animal) {
			System.out.println(animalele);
		}

	}

}
