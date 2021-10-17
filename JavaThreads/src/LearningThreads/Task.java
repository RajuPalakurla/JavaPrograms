package LearningThreads;

public class Task extends Thread{
	String threadnameString;
	
	public Task(String threadnameString) {
		super();
		this.threadnameString = threadnameString;
	}

	public void setName() {
		Thread.currentThread().setName(threadnameString);
	}
	public void run() {
		setName();
		for (int i = 0; i < 1000; i++) {
			System.out.println("Number "+i+" "+currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
