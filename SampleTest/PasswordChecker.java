package SampleTest;

import java.util.Scanner;

public class PasswordChecker {
	static int[][] keypad = {
	        {1, 2, 3},
	        {4, 5, 6},
	        {7, 8, 9},
	        {-1, 0, -2}
	    };

	    static boolean isAdjacent(int a, int b) {
	        int ax = -1, ay = -1, bx = -1, by = -1;

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (keypad[i][j] == a) {
	                    ax = i;
	                    ay = j;
	                }
	                if (keypad[i][j] == b) {
	                    bx = i;
	                    by = j;
	                }
	            }
	        }

	        if (ax == -1 || bx == -1) return false;

	        int dx = Math.abs(ax - bx);
	        int dy = Math.abs(ay - by);

	        
	        return (dx == 1 && dy == 0) || (dx == 0 && dy == 1);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();

	        for (int tc = 1; tc <= T; tc++) {
	            int N = sc.nextInt();
	            int[] correct = new int[N];
	            int[] input = new int[N];

	            for (int i = 0; i < N; i++) {
	                correct[i] = sc.nextInt();
	            }
	            for (int i = 0; i < N; i++) {
	                input[i] = sc.nextInt();
	            }

	            int diffCount = 0;
	            int diffPos = -1;
	            boolean valid = true;

	            for (int i = 0; i < N; i++) {
	                if (correct[i] != input[i]) {
	                    diffCount++;
	                    if (diffCount > 1) {
	                        valid = false;
	                        break;
	                    }
	                    if (!isAdjacent(correct[i], input[i])) {
	                        valid = false;
	                        break;
	                    }
	                    diffPos = i + 1;
	                }
	            }

	            if (diffCount == 0) {
	                System.out.println("#" + tc + " 0");
	            } else if (valid && diffCount == 1) {
	                System.out.println("#" + tc + " " + diffPos);
	            } else {
	                System.out.println("#" + tc + " -1");
	            }
	        }

	        sc.close();
	    }

}
