package javaSe.algorithm;
/**
 * 开平方问题
 * @author Administrator
 *
 */
public class IntegerSqrt {
	public int MySqrt(int x) {
		if (x < 1) {
			return x;
		}
		int low = 1, high = x;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int sqrt = x / mid;
			if (sqrt == mid) {
				return mid;
			} else if (sqrt < mid) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return 0;

	}
}
