package javaSe.generics;

// 泛型学习类
/**
 * 泛型类
 * 
 * @ClassName: Box
 * @Description: 泛型类
 * @author Administrator
 * @date 2018年3月23日 下午2:16:50
 * 
 * @param <T>
 */
class Box<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

/**
 * 泛型方法
 * 
 * @ClassName: Util
 * @Description: 泛型类方法，在返回值前加标识
 * @author Administrator
 * @date 2018年3月23日 下午2:16:30
 *
 */
class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
}

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

public class GenericsTest {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		boolean same = Util.<Integer, String> compare(p1, p2);
		System.out.println(same);

		Pair<Integer, String> p3 = new Pair<>(1, "apple");
		Pair<Integer, String> p4 = new Pair<>(2, "pear");
		boolean same1 = Util.compare(p3, p4);
		System.out.println(same1);
	}
}