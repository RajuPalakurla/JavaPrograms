package LearningThreads;

public class Application2 {

	public static void main(String[] args) {
		Task task= new Task("Thread - A");
		Thread t1 = new Thread(task);
		t1.start();
		
		System.out.println("Hello There...");
		
		Task task2= new Task("Thread - B");
		Thread t2 = new Thread(task2);
		t2.start();
		
	}

}
