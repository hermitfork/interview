package javaSe.Thread.runnable;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BasicCyclicBarrierTest {
	static CyclicBarrier c = new CyclicBarrier(2, new A());

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("线程" + Thread.currentThread().getName() + "正在写入数据...");
					c.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
				System.out.println("线程" + Thread.currentThread().getName() + "写入数据完毕，等待其他线程写入完毕");
			}
		}).start();

		try {
			System.out.println("主线程" + Thread.currentThread().getName() + "写入数据完毕，等待其他线程写入完毕");
			c.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("所有线程写入完毕，继续处理其他任务...");
	}

	static class A implements Runnable {
		@Override
		public void run() {
			System.out.println("当前线程" + Thread.currentThread().getName());
		}
	}
}
