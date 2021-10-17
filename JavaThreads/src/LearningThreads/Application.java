package LearningThreads;

public class Application {
	public static void main(String[] args) {
		Task task= new Task("Thread - A");
		task.start();
		
		System.out.println("Hello There...");
		
		Task task2= new Task("Thread - B");
		task2.start();
		
	}

}
