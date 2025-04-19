import java.util.Scanner;

public class CALSQRT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int i = 1; i <= T; i++) {
			int n = scanner.nextInt();
			int result = sqrtInt(n);
			System.out.println("#" + i + " " + result);
		}

		scanner.close();
	}

	public static int sqrtInt(int n) {
		if (n == 0 || n == 1)
			return n;

		int left = 1, right = n, ans = 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if ((long) mid * mid == n) {
				return mid;
			}

			//mid * mid < n => increase mid else reduce
			if ((long) mid * mid < n) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return ans;
	}
}
