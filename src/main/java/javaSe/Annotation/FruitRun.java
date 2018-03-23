package javaSe.Annotation;

import sun.misc.Unsafe;

/**
 * 输出结果
 */
public class FruitRun {
	public static void main(String[] args) {
		Unsafe unsafe = getUnsafe();
		FruitInfoUtil.getFruitInfo(Apple.class);
	}
}