import java.util.Scanner;

public class SumOfProduct {
	static final int MOD = 1000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			int N = sc.nextInt();
			long sum = 0;

			int i = 1;
			while (i <= N) {
				int y = N / i;
				int last = N / y;

				long count = last - i + 1;
				long totalX = ((long) (i + last) * count / 2) % MOD;
				sum = (sum + totalX * y % MOD) % MOD;

				i = last + 1;
			}

			System.out.println(sum);
		}

		sc.close();
	}

}
