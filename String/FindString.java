package String;

import java.util.Scanner;

public class FindString {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int test = 0; test < 10; test++) {
            int testCase = Integer.parseInt(sc.nextLine());
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int count = 0;
            for (int i = 0; i <= s2.length() - s1.length(); i++) {
                if (s2.substring(i, i + s1.length()).equals(s1)) {
                    count++;
                }
            }
            System.out.println("#" + testCase + " " + count);
        }

        sc.close();
    }
}
