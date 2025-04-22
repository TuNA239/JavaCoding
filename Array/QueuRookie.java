package Array;

import java.util.Scanner;

public class QueuRookie {

	static int N;
    static int[] height = new int[1001];
    static int[] taller = new int[1001];
    static int[] result = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                height[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                taller[i] = sc.nextInt();
            }

            sort();

            for (int i = 0; i < N; i++) {
                result[i] = -1;
            }

            for (int i = 0; i < N; i++) {
                int cnt = 0;
                for (int j = 0; j < N; j++) {
                    if (result[j] == -1) {
                        if (cnt == taller[i]) {
                            result[j] = height[i];
                            break;
                        }
                        cnt++;
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                System.out.print(result[i]);
                if (i < N - 1) System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }

    static void sort() {
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (height[j] < height[i] || (height[j] == height[i] && taller[j] < taller[i])) {
                    int temp = height[i];
                    height[i] = height[j];
                    height[j] = temp;

                    temp = taller[i];
                    taller[i] = taller[j];
                    taller[j] = temp;
                }
            }
        }
    }

}
