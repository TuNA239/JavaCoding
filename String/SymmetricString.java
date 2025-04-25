package String;

import java.util.Scanner;

public class SymmetricString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int t = 1; t <= T; t++) {
			String s = sc.nextLine();
			int result = countPalindromes(s);
			System.out.println("#" + t + " " + result);
		}

		sc.close();
	}
	
	public static int countPalindromes(String s) {
		int count = 0;
		int n = s.length();

		for (int center = 0; center < n; center++) {
			int left = center, right = center;
			while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
				count++;
				left--;
				right++;
			}

			left = center;
			right = center + 1;
			while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
				count++;
				left--;
				right++;
			}
		}

		return count;
	}
}
