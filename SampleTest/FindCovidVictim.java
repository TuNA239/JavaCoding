package SampleTest;

import java.util.Scanner;

public class FindCovidVictim {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // số lượng test case

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] contact = new int[N][N];
            boolean[] isF0 = new boolean[N];
            boolean[] isF1 = new boolean[N];
            boolean[] isF2 = new boolean[N];

            // đọc ma trận tiếp xúc
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    contact[i][j] = sc.nextInt();
                }
            }

            // đọc danh sách người F0
            for (int i = 0; i < M; i++) {
                int id = sc.nextInt() - 1; // trừ 1 vì chỉ số trong mảng là từ 0
                isF0[id] = true;
            }

            // tìm người F1
            for (int i = 0; i < N; i++) {
                if (isF0[i]) {
                    for (int j = 0; j < N; j++) {
                        if (contact[i][j] == 1 && !isF0[j]) {
                            isF1[j] = true;
                        }
                    }
                }
            }

            // tìm người F2
            for (int i = 0; i < N; i++) {
                if (isF1[i]) {
                    for (int j = 0; j < N; j++) {
                        if (contact[i][j] == 1 && !isF0[j] && !isF1[j]) {
                            isF2[j] = true;
                        }
                    }
                }
            }

            
            int cntF1 = 0;
            int cntF2 = 0;
            for (int i = 0; i < N; i++) {
                if (isF1[i]) cntF1++;
                if (isF2[i]) cntF2++;
            }

            // in kết quả
            System.out.println("#" + t + " " + cntF1 + " " + cntF2);
        }
    }
}
