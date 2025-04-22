package Array;

import java.util.Scanner;

public class FirstDuplicate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            int[] freq = new int[100001];
            int answer = -1;

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
                freq[arr[i]]++;

                if (freq[arr[i]] == 2 && answer == -1) {
                    answer = arr[i];
                    break;
                }
            }

            System.out.println("#" + (t + 1) + " " + answer);
        }

	}

}
