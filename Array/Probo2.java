package Array;

import java.util.Scanner;

public class Probo2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int t = 1; t <= T; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            sc.nextLine();

            char[][] matrix = new char[5 * M + 1][5 * N + 1];
            for (int i = 0; i < 5 * M + 1; i++) {
                matrix[i] = sc.nextLine().toCharArray();
            }

            int[] count = new int[5];

            for (int row = 0; row < M; row++) {
                for (int col = 0; col < N; col++) {
                    int starCount = 0;
                    int startRow = 1 + row * 5;
                    int startCol = 1 + col * 5;
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (matrix[startRow + i][startCol + j] == '*') {
                                starCount++;
                            }
                        }
                    }

                    if (starCount % 4 == 0) {
                        count[starCount / 4]++;
                    }
                }
            }
            
            System.out.print("#" + t);
            for (int i = 0; i < 5; i++) {
                System.out.print(" " + count[i]);
            }
            System.out.println();
        }

        sc.close();
    }
}
