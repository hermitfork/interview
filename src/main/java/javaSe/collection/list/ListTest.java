package javaSe.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * ListTest类
 * 
 * @author zyz
 *
 */
public class ListTest {
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		/**
		 * 
		 */
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		for (String item : list) {
			System.out.println(item);
		}
		Iterator<String> it = list.iterator();
		for (String string : list) {
			System.out.println(string);
		}
		Collections.synchronizedList(list);
		// List list1 = Arrays.asList(1, 2, 3);
		Integer[] arr = { 1, 2, 3 };
		List list1 = Arrays.asList(arr);
		for (Object i : list1) {
			System.out.println(i.toString());
		}
		CopyOnWriteArrayList cwl = new CopyOnWriteArrayList();
		cwl.add("123");
		cwl.add("wer");
		cwl.add("qer");
		cwl.add("123");
		/*
		 * Iterator it1 = cwl.iterator(); while (it1.hasNext()) {
		 * System.out.println("iterator遍历方法1"); System.out.println(it1.next());
		 * }
		 */
		for (Iterator iterator = cwl.iterator(); iterator.hasNext();) {
			System.out.println("iterator 遍历方式2");
			System.out.println(iterator.next());
		}

	}
}
