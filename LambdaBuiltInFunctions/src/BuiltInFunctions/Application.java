package BuiltInFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
		List<Car> cars=Arrays.asList(
		new Car("Honda", "Accord", "Red", 22300),
		new Car("Honda", "Civic", "Blue", 17700),
		new Car("Toyota", "Lord Cruiser", "white", 48500),
		new Car("Toyota", "Corrola", "Black", 16200),
		new Car("Honda", "Camry", "Black", 24400),
		new Car("Mission", "Sentra", "white", 17300),
		new Car("Mistu", "Lancer", "White", 20000),
		new Car("Jeep", "Wrangler", "Red", 24500));
		
//		printCarPriceRange(cars, 20000, 25000);
		
//		printColorCar(cars, "white");
		System.out.println("Price range between 18000 and 25000 : via ananymous class");
		printCar(cars,new Condition() {
			
			@Override
			public boolean test(Car car) {
				return car.getPrice() >= 18000 && car.getPrice() <= 25000;
			}
		});
		System.out.println("Print Red cars calling  via ananymous class");
		printCar(cars,new Condition() {
			
			@Override
			public boolean test(Car car) {
				return car.getColor().equalsIgnoreCase("Red");
			}
		});
		
		System.out.println("\nPrint cars calling (Price range between 18000 and 25000 ) via lambda expression");
		printCar(cars, (c)->c.getPrice() >= 18000 && c.getPrice() <= 25000);
		
		System.out.println("\nPrint Red cars calling  via lambda expression");
		printCar(cars, (c)->c.getColor().equalsIgnoreCase("red"));
		
		System.out.println("\nGeneric Print cars calling (Price range between 18000 and 25000 ) via lambda expression");
		printCar2(cars, (c)->c.getPrice() >= 18000 && c.getPrice() <= 25000);
		
		System.out.println("\nGenric Print Red cars calling  via lambda expression");
		printCar2(cars, (c)->c.getColor().equalsIgnoreCase("red"));
		
		System.out.println("\nGeneric Print cars calling (Price range between 18000 and 25000 ) via lambda expression using built in functionalInterface");
		printCar3(cars, (c)->c.getPrice() >= 18000 && c.getPrice() <= 25000);
		
		System.out.println("\nGenric Print Red cars calling  via lambda expression using built in functionalInterface");
		printCar3(cars, (c)->c.getColor().equalsIgnoreCase("red"));
		
		System.out.println("\nGenric Print price and color using built in functionalInterface");
		Function<Car,String> priceAndcolor=(c)-> "Car price :"+c.getPrice()+" Car Color :"+c.getColor();
		System.out.println(priceAndcolor.apply(cars.get(0)));
	}
	
	public static void printCarPriceRange(List<Car> car,int low,int high) {
		for (Car car2 : car) {
			if(low <= car2.getPrice() && high >= car2.getPrice()) {
				car2.print();
			}
		}
	}
	
	public static void printColorCar(List<Car> colorCars,String color) {
		for (Car car : colorCars) {
			if(car.getColor().equalsIgnoreCase(color)) {
				car.print();
			}
		}
	}
	public static void printCar(List<Car> cars,Condition condition) {
		for (Car car : cars) {
			if(condition.test(car)) {
				car.print();
			}
		}
	}
	
	public static void printCar2(List<Car> cars,Condition2<Car> condition) {
		for (Car car : cars) {
			if(condition.test(car)) {
				car.print();
			}
		}
	}
	public static void printCar3(List<Car> cars,Predicate<Car> predicate) {
		for (Car car : cars) {
			if(predicate.test(car)) {
				car.print();
			}
		}
	}
	
	
}


@FunctionalInterface
interface Condition{
	public boolean test(Car car);
}

@FunctionalInterface
interface Condition2<T>{
	public boolean test(T car);
}
