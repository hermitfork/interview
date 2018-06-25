package javaSe.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeArrayList {
	public static void main(String[] args) {
		// 第一种推荐使用
		List<String> strList = new ArrayList<>();
		strList.add("1");
		strList.add("2");
		strList.add("3");
		strList.add("4");
		Iterator<String> it = strList.iterator();
		while (it.hasNext()) {
			String e = it.next();
			if (e.equals("3")) {
				it.remove();
			}
		}
		// 第二种不是很推荐，会在删除元素后，不控制list集合的话就在for循环的时候报错,因为删除数组的话会重新生成list，但是list的length会改变，所以在遍历到最后的时候会报错
		int strListLength = strList.size();
		// for (int i = 0; i < strListLength; i++) {
		for (int i = 0, len = strList.size(); i < len; ++i) {
			if (strList.get(i).equals("3")) {
				strList.remove(i);
				--i;
				// --strListLength;
				--len;
			}
		}
	}
}