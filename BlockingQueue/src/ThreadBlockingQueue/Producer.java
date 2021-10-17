package ThreadBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> quentionQueue;
	int questionNumber;

	public Producer(BlockingQueue<Integer> quentionQueue) {
		this.quentionQueue = quentionQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				synchronized (this) {
					int nextQuestion=questionNumber++;
					System.out.println("Adding New question :"+nextQuestion);
					quentionQueue.put(nextQuestion);
				}
			} catch (InterruptedException e1) {
			}
		}
	}
}