package Array;

import java.util.Scanner;

public class BtfNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			int length = scanner.nextInt();
			int[] BTFNum = new int[length];

			int totalBTFNum = scanner.nextInt();

			for (int j = 0; j < length; j++) {
				BTFNum[j] = scanner.nextInt();
			}

			int head = scanner.nextInt();
			int tail = scanner.nextInt();

			int countCorrectCode = 0;

			for (int currentNum = head; currentNum <= tail; currentNum++) {
				int countDigit = 0;
				int temp = currentNum;
				while (temp > 0) {
					int lastDigit = temp % 10;
					if (isContain(BTFNum, lastDigit)) {
						countDigit++;
					}
					if (countDigit == totalBTFNum) {
						countCorrectCode++;
						break;
					}
					temp = temp / 10;
				}
			}
			System.out.println("#" + (i + 1) + " " + countCorrectCode);
		}
	}

	public static boolean isContain(int[] arr, int num) {
		for (int value : arr) {
			if (value == num) {
				return true;
			}
		}
		return false;
	}

}
