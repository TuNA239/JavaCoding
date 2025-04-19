import java.util.Scanner;

public class ZipNumber {

	public static int digitalRoot(int n) {
        if (n == 0) return 0;
        return 1 + (n - 1) % 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println("#" + i + " " + digitalRoot(n));
        }

        scanner.close();
    }
}
