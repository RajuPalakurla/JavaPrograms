package ThreadPool.com;

public class MessageProcessor implements Runnable {
	private int messageno;
	public MessageProcessor(int messageno) {
		this.messageno=messageno;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"[Received] Message number="+messageno);
		respondToMessage(messageno);
		System.out.println(Thread.currentThread().getName()+" (DONE) process message ="+messageno);
	}
	private void respondToMessage(int messageno2) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
	}

}
