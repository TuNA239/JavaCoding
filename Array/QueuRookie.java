package Array;

import java.util.Scanner;

public class QueuRookie {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t = 0; t < T; t++) {
        	int N = sc.nextInt();
        	int[][] arr = new int[2][N];
        	
        	for(int i = 0; i < N; i++) {
        		arr[0][i] = sc.nextInt();
        	}
        	
        	for(int i = 0; i < N; i++) {
        		arr[1][i] = sc.nextInt();
        	}
        	
        	for(int i = 0; i < N-1; i++) {
        		for(int j = i + 1; j < N; j++) {
        			if(arr[0][i] > arr[0][j]) {
        				int temp = arr[0][i];
        				int temp2 = arr[0][j];
        				arr[0][j] = temp;
        				arr[0][i] = temp2;
        				
        				int pos = arr[1][i];
        				int pos2 = arr[1][j];
        				arr[1][j] = pos;
        				arr[1][i] = pos2;
        			}
        		}
        	}
        	
        	int index = 0;
        	for(int i = 1; i < N ; i++) {
        		for(int j = i + 1; j <N; j++) {
        			if(index < arr[1][i]) {
        				int temp = arr[0][i];
        				int temp2 = arr[0][j];
        				arr[0][j] = temp;
        				arr[0][i] = temp2;
        			}
        		}
//        		int temp = arr[0][i];
//				int temp2 = arr[0][index];
//				arr[0][index] = temp;
//				arr[0][i] = temp2;
        	}
        	
        	for(int i = 0; i < N; i ++) {
        		System.out.print(arr[0][i] + ", ");
        	}
        }
        
        
    }

}
