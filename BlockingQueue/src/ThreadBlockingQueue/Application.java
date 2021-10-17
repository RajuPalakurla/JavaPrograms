package ThreadBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {
	public static void main(String[] args) {
		BlockingQueue<Integer> quetionQueue=new ArrayBlockingQueue<Integer>(5);
		
		Thread t1 = new Thread(new Producer(quetionQueue));
		Thread t2 = new Thread(new Consumer(quetionQueue));
		
		t1.start();
		t2.start();
	}
}