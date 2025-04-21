package Array;

import java.util.Scanner;

public class CountThePair {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for(int t = 0; t < T; t++) {
			int N = scanner.nextInt();
			int K = scanner.nextInt();
			
			int[] arr = new int[N];
			for(int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
			}
			
			int count = 0;
			for(int i = 0; i < N - 1; i++) {
				for(int j = i +1; j < N; j++) {
					if(arr[i] - arr[j] == K || arr[j] - arr[i] == K) {
						count = count + 1;
					}
				}
			}
			System.out.println(count);
		}
		
		

	}

}
