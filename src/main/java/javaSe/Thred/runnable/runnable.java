package javaSe.Thred.runnable;

import java.lang.Thread;

class MyThread implements Runnable {
	public void run() {
		System.out.println("implements Runnable 实现");
	}
}

public class runnable {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread th = new Thread(mt);
		th.start();
	}
}
