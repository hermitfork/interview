package javaSe.Thread.runnable.quene;

//生产者
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<String> queue;

	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is making product...");
		String product = "made by " + Thread.currentThread().getName();
		try {
			queue.put(product);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
