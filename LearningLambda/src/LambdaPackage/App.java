package LambdaPackage;

public class App {
	
	public static void main(String[] args) {
		Robot tomRobot=new Robot();
		walker(tomRobot);

		Human manHuman=new Human();
		walker(manHuman);
		
//		creating function on the fly 
		walker(new Walkable() {
			
			@Override
			public void walk() {
				System.out.println("Custom object walking");
				
			}
		});
//		Method 1
		walker( () -> System.out.println("Lambda expression"));
		
//		Method2
		walker( () -> {
			System.out.println("Lambda expression1");
			System.out.println("Lambda expression2");
		});
		
//		Method3((Alambdainterface) should be interface and abstract method) and it should be functional interface that means interface should have atleast one abstract method
		Alambdainterface aBlockofCode= () -> {
			System.out.println("Lambda expression1");
			System.out.println("Lambda expression2");
		};
		
		Walkable walkable= () -> {
			System.out.println("Lambda expression3");
			System.out.println("Lambda expression4");
		};
		walker(walkable);
		
		Alambdainterface alambdainterface=()->System.out.println("Hello there");// Equivalent to hello function
		alambdainterface.some();
		SumInterface sumInterface=(a,b) -> a+b;// Equivalent to sum(a,b);
		System.out.println(sumInterface.sum(10, 20));
		
		SumInterface sumInterface2=(a,b) -> {
			int ret=0;
			if (b!=0 & a!=0) {
				ret=a/b;
			}
			return ret;
		};
		System.out.println(sumInterface2.sum(20, 10));
		
		Compute<String>  reverseInterface2=(value) -> {
			String returnval = "";
			for (int i = value.length()-1; i >=0; i--) {
				returnval +=value.charAt(i);
			}
			return returnval;
		};
		System.out.println(reverseInterface2.compute("RAJUPALAKURLA"));
		
		Compute<Integer> factorial=(value) -> {
					int returnval = 1;
					for (int i = value; i >0; i--) {
						returnval *=i;
					}
					return returnval;
				};
		System.out.println(factorial.compute(6));
	}
	
	public static void walker(Walkable action) {
		action.walk();
	}

	public static void hello() {
		System.out.println("Hello there..");
	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int divide(int a,int b) {
		int returnval=0;
		if(b!=0 && a != 0) {
			returnval=a/b;
		}
		return returnval;
	}
	
	public static String reverse(String value) {
		String returnval = null;
		for (int i = value.length()-1; i >=0; i--) {
			returnval +=value.charAt(i);
		}
		return returnval;
	}
	
	public static int factorial(int value) {
		int returnval = 1;
		for (int i = value; i >0; i--) {
			returnval *=i;
		}
		return returnval;
	}
}

interface Compute <T>{
	public T compute(T value);
}