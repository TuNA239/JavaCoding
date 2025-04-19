import java.util.Scanner;

public class AddingReversedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		for (int i = 0; i < testCases; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			int reversed1 = reverseNumber(num1);
			int reversed2 = reverseNumber(num2);

			int sum = reversed1 + reversed2;
			int result = reverseNumber(sum);

			System.out.println(result);
		}

		scanner.close();
	}

	public static int reverseNumber(int num) {
		int reversed = 0;
		while (num > 0) {
			reversed = reversed * 10 + (num % 10);
			num /= 10;
		}
		return reversed;
	}

}
