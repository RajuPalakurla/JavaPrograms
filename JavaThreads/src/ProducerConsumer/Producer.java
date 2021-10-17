package ProducerConsumer;

import java.util.List;

public class Producer implements Runnable {
	int questionNo;
	List<Integer> questionList = null;
	int QUTN_LIMIT=5;

	public Producer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}
	
	void readQuestion(int questionNo) throws InterruptedException {
		synchronized (questionList) {
			while(questionList.size()==QUTN_LIMIT) {
				System.out.println("Question limits reached .... no more questions are allowed");
				questionList.wait();
			}
		}
		
		synchronized (questionList) {
			System.out.println("New Question to read "+questionNo);
			questionList.add(questionNo);
			Thread.sleep(100);
			questionList.notify();
		}
	}


	@Override
	public void run() {
		while(true) {
			try {
				readQuestion(questionNo++);
			} catch (InterruptedException e) {
			}
		}
	}
	
}
