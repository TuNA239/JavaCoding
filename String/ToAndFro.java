package String;

import java.util.Scanner;

public class ToAndFro {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int cols = Integer.parseInt(sc.nextLine());
            if (cols == 0) break;
            
            String encrypted = sc.nextLine();
            int len = encrypted.length();
            int rows = len / cols;
            
            char[][] grid = new char[rows][cols];
            int index = 0;
            
            for (int i = 0; i < rows; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < cols; j++) {
                        grid[i][j] = encrypted.charAt(index++);
                    }
                } else {
                    for (int j = cols - 1; j >= 0; j--) {
                        grid[i][j] = encrypted.charAt(index++);
                    }
                }
            }

            StringBuilder result = new StringBuilder();
            for (int col = 0; col < cols; col++) {
                for (int row = 0; row < rows; row++) {
                    result.append(grid[row][col]);
                }
            }

            System.out.println(result.toString());
        }

        sc.close();
    }

}
