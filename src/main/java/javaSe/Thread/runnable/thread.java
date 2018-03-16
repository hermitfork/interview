package javaSe.Thread.runnable;

import java.lang.Thread;

class ThreadTest extends Thread {
	public void run() {
		System.out.println("extends Thread 实现");
	}
}

public class thread {
	public static void main(String[] args) {
		ThreadTest tt1 = new ThreadTest();
		ThreadTest tt2 = new ThreadTest();
		tt1.start();
		tt2.start();
	}

}
