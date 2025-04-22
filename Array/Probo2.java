package Array;

import java.util.Scanner;

public class Probo2 {
    static final int MAX_N = 502;
    static char[][] map = new char[MAX_N][MAX_N];
    static int[] ret = new int[5];
    static int T, N, M;

    public static void check(int r, int c) {
        for (int i = 3; i >= 0; i--) {
            if (map[r + i][c] == '*') {
                ret[i + 1]++;
                return;
            }
        }
        ret[0]++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int originalN = sc.nextInt();
            int originalM = sc.nextInt();
            N = 5 * originalN + 1;
            M = 5 * originalM + 1;

            for (int i = 0; i < 5; i++) {
                ret[i] = 0;
            }

            sc.nextLine();

            for (int i = 0; i < N; i++) {
                String line = sc.nextLine();
                while (line.length() < M) {
                    line += " ";
                }
                for (int j = 0; j < M; j++) {
                    map[i][j] = line.charAt(j);
                }
            }

            for (int i = 1; i < N; i += 5) {
                for (int j = 1; j < M; j += 5) {
                    check(i, j);
                }
            }

            System.out.print("#" + tc + " ");
            for (int i = 0; i < 5; i++) {
                System.out.print(ret[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
