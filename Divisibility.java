import java.util.Scanner;

public class Divisibility {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        
	        for (int i = 0; i < t; i++) {
	            int n = scanner.nextInt();
	            int x = scanner.nextInt();
	            int y = scanner.nextInt();
	            
	            boolean found = false;
	            for (int ai = x; ai < n; ai += x) {
	                if (ai % y != 0) { 
	                    System.out.print(ai + " ");
	                    found = true;
	                }
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }

}
