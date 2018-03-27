package javaSe.algorithm;

public class binarySearch {
	/**
	 * 要求[]数组有序
	 * 
	 * 要不就要用对 Arrays.sort(a)其排序
	 * @param key
	 * @param arr
	 * @return
	 * 
	 *  
	 */
	public static int binarySearch(int key, int[] arr) {
		// 定义最高位和最低位
		int low = 0, high = arr.length - 1;
		// 循环做筛选,判断如果mid值小于key值在前面则更改高位到前面,如果key值小于mid值在后面则做筛选操作
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (key == arr[mid]) {
				return mid;
			}
			if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;

	}
}
