package LearningThreads;

public class Task2 implements Runnable{
	String threadnameString;
	
	public void Task(String threadnameString) {
		this.threadnameString = threadnameString;
	}

	public void setName() {
		Thread.currentThread().setName(threadnameString);
	}
	public void run() {
		setName();
		for (int i = 0; i < 1000; i++) {
			System.out.println("Number "+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
