package ThreadPool.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		Runnable process1=new MessageProcessor(2);
		executor.execute(process1);
		
		Runnable process2=new MessageProcessor(3);
		executor.execute(process2);
		Runnable process3=new MessageProcessor(4);
		executor.execute(process3);
		Runnable process4=new MessageProcessor(5);
		executor.execute(process4);
		
		executor.shutdown();//Rejects any new tasks from being submitted. Gracefully shut downs the service 
//		executor.shutdownNow();//Terminate the executor service immediately 
	
		try {
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		while(executor.isTerminated()) {
//			
//		}
		
		System.out.println("All Task submitted...");
	}
}
