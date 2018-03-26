package javaSe.Thread.runnable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * callable线程启动方式
 * 
 * @author Administrator
 *
 */
class MyCallable1 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return 1;
	}

}

public class CallableTest {
	public static void main(String[] args) {
		MyCallable1 mc = new MyCallable1();
		FutureTask<Integer> ft = new FutureTask<>(mc);
		Thread thread = new Thread(ft);
		thread.start();
		try {
			System.out.println(ft.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
