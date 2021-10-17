package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer1 implements Runnable {
	BlockingQueue<Integer> questionQueue;

	public Consumer1(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println("Answered Question : " + questionQueue.take());
			} catch (InterruptedException e) {

			}
		}
	}

}
