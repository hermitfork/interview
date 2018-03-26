package javaSe.Thread.runnable;

public class ThreadLocalTest {
	private ThreadLocal tl = new ThreadLocal() {

	};

	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.setDaemon(true);
		thread.interrupt();
	}
}
