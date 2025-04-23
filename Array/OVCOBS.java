package Array;

import java.util.Scanner;

public class OVCOBS {

	static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) { 
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int count = 0;
            while (true) {
                int currentHeight = matrix[x][y];
                int minHigher = Integer.MAX_VALUE;
                int nextX = -1, nextY = -1;

                
                for (int d = 0; d < 8; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                        int neighborHeight = matrix[nx][ny];
                        if (neighborHeight > currentHeight && neighborHeight < minHigher) {
                            minHigher = neighborHeight;
                            nextX = nx;
                            nextY = ny;
                        }
                    }
                }

                if (nextX == -1) break;

                x = nextX;
                y = nextY;
                count++;
            }

            System.out.println("#" + t + " " + count);
        }

        sc.close();
    }

}
