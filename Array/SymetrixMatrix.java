package Array;

import java.util.Scanner;

public class SymetrixMatrix {
	static final int MAX_SIZE = 33;
    static int N;
    static int[][] A = new int[MAX_SIZE][MAX_SIZE];
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            readData(sc);
            System.out.println("#" + tc + " " + isSymmetry());
        }
    }

    public static void readData(Scanner sc) {
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
    }

    public static String isSymmetry() {
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] != A[N - i - 1][j] || A[j][i] != A[j][N - i - 1]) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
