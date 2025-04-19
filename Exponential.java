import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int i = 1; i <= T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            long result = power(a, b);
            System.out.println("#" + i + " " + result);
        }

	}

	public static long power(int a, int b) {
		if(b == 0) return 1;
		if(b == 1) return a;
		//Check b is even or odd
		if(b % 2 == 0) {
			long result = 1;
			//a^b = (a^(b/2) * a^(b/2))
			//O(n/2) instead of O(n)
			for(int i = 0; i < b/2; i++) {
				result *= a;
			}
			return result * result;
		}else {
			long result = 1;
			for(int i = 0; i < (b-1)/2; i++) {
				result *= a;
			}
			return result * result * a;
		}
	}
}
