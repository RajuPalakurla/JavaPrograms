package ProducerConsumer;

import java.util.List;

public class Consumer implements Runnable {
	List<Integer> questionList = null;

	public Consumer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}
	
	void answerQuestion() throws InterruptedException {
		synchronized (questionList) {
			while(questionList.isEmpty()) {
				System.out.println("No Question to Anwser");
				questionList.wait();
			}
		}
		
		synchronized (questionList) {
			Thread.sleep(500);
			System.out.println("Answered Question  : "+questionList.remove(0));
			questionList.notify();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {
			}
		}
	}
	
}
