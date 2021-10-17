package BlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer1 implements Runnable {

	BlockingQueue<Integer> quentionQueue;
	int questionNumber;

	public Producer1(BlockingQueue<Integer> quentionQueue) {
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
