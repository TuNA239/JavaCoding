package Array;

import java.util.Scanner;

public class SelectedKnight {

    static int MAX_N = 1000;
    static int N, K, M, D, T;
    static boolean[][] hasPiece = new boolean[MAX_N][MAX_N];
    static boolean[][] cannotEat = new boolean[MAX_N][MAX_N];
    static int[] knightRow = new int[MAX_N * MAX_N];
    static int[] knightCol = new int[MAX_N * MAX_N];

    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt();
        for (int test = 1; test <= T; test++) {
            N = scanner.nextInt();
            K = scanner.nextInt();
            M = scanner.nextInt();
            D = scanner.nextInt();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    hasPiece[i][j] = false;
                    cannotEat[i][j] = false;
                }
            }

            for (int i = 0; i < K; i++) {
                int r = scanner.nextInt();
                int c = scanner.nextInt();
                knightRow[i] = r;
                knightCol[i] = c;
                hasPiece[r][c] = true;
            }

            for (int i = 0; i < M; i++) {
                int r = scanner.nextInt();
                int c = scanner.nextInt();
                hasPiece[r][c] = true;
            }

            for (int i = 0; i < D; i++) {
                int r = scanner.nextInt();
                int c = scanner.nextInt();
                cannotEat[r][c] = true;
            }

            int maxEat = -1;
            int ansR = -1, ansC = -1;

            for (int i = 0; i < K; i++) {
                int r = knightRow[i];
                int c = knightCol[i];
                int cnt = count(r, c);
                if (cnt > maxEat) {
                    maxEat = cnt;
                    ansR = r;
                    ansC = c;
                }
            }

            System.out.println("#" + test + " " + ansR + " " + ansC + " " + maxEat);
        }

        scanner.close();
    }

    public static int count(int r, int c) {
        int res = 0;
        for (int d = 0; d < 8; d++) {
            int nr = r + dx[d];
            int nc = c + dy[d];
            if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                if (hasPiece[nr][nc] && !cannotEat[nr][nc]) {
                    res++;
                }
            }
        }
        return res;
    }
}
