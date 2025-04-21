package Array;

import java.util.Scanner;

public class TowerBuilder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int t = 0; t < T; t++) {
			int N = scanner.nextInt();
			int M1 = scanner.nextInt();
			int M2 = scanner.nextInt();

			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
			}

			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			int cost = 0;
			for (int index = 0; index < N; index++) {
				if (M1 > M2) {
					cost = cost + (M1 * arr[index]);
					M1 = M1 - 1;
				} else {
					cost = cost + (M2 * arr[index]);
					M2 = M2 - 1;
				}
			}
			System.out.println("#" + (t+1) + " " + cost);

		}

	}

}
