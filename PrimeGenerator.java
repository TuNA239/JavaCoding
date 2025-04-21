import java.util.Scanner;

public class PrimeGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int test = 0; test < t; test++) {
			int m = sc.nextInt();
			int n = sc.nextInt();

			for (int i = m; i <= n; i++) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}

			if (test < t - 1) {
				System.out.println();
			}
		}
		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
