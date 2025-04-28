package String;

import java.util.Scanner;

public class MaxSymmetricString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int test = 1; test <= T; test++) {
			String s = sc.nextLine();
			int n = s.length();
			boolean[][] dp = new boolean[n][n];
			int maxLength = 1;

			for (int i = 0; i < n; i++) {
				dp[i][i] = true;
			}

			for (int i = 0; i < n - 1; i++) {
				if (s.charAt(i) == s.charAt(i + 1)) {
					dp[i][i + 1] = true;
					maxLength = 2;
				}
			}

			for (int len = 3; len <= n; len++) {
				for (int i = 0; i <= n - len; i++) {
					int j = i + len - 1;
					if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
						dp[i][j] = true;
						maxLength = len;
					}
				}
			}

			System.out.println("#" + test + " " + maxLength);
		}
		sc.close();
	}
}
