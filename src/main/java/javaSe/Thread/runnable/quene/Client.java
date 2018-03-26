package javaSe.Thread.runnable.quene;

//客户端
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Client {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new LinkedBlockingQueue<>(5);
		for (int i = 0; i < 2; i++) {
			new Thread(new Consumer(queue), "Consumer" + i).start();
		}
		for (int i = 0; i < 5; i++) {
			// 只有两个 Product，因此只能消费两个，其它三个消费者被阻塞
			new Thread(new Producer(queue), "Producer" + i).start();
		}
		for (int i = 2; i < 5; i++) {
			new Thread(new Consumer(queue), "Consumer" + i).start();
		}
	}
}
