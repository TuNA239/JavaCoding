import java.util.Scanner;

public class NUMPER {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int t = 1; t <= T; t++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			int start = sqrtInt(a);
			if (start * start < a) {
				start++;
			}

			int end = sqrtInt(b);
			boolean found = false;

			System.out.print("#" + t);

			for (int i = start; i <= end; i++) {
				int square = i * i;
				if (square >= a && square <= b) {
					System.out.print(" " + square);
					found = true;
				}
			}

			if (!found) {
				System.out.print(" NO NUMBER");
			}

			System.out.println();
		}
	}

	public static int sqrtInt(int n) {
		int left = 1, right = n, ans = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if ((long) mid * mid <= n) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return ans;
	}

}
