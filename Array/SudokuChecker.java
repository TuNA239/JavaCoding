package Array;

import java.util.Scanner;

public class SudokuChecker {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int t = 1; t <= T; t++) {
            char[][] board = new char[9][9];
            for (int i = 0; i < 9; i++) {
                board[i] = sc.nextLine().toCharArray();
            }

            boolean valid = isValidSudoku(board);
            System.out.println("#" + t + " " + (valid ? 1 : 0));
        }
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] rowSeen = new boolean[10];
            boolean[] colSeen = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    if (rowSeen[num]) return false;
                    rowSeen[num] = true;
                }

                if (board[j][i] != '.') {
                    int num = board[j][i] - '0';
                    if (colSeen[num]) return false;
                    colSeen[num] = true;
                }
            }
        }

        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                boolean[] seen = new boolean[10];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[boxRow + i][boxCol + j];
                        if (c != '.') {
                            int num = c - '0';
                            if (seen[num]) return false;
                            seen[num] = true;
                        }
                    }
                }
            }
        }

        return true;
    }

}
