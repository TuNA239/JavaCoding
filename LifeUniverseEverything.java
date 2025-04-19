import java.util.Scanner;

public class LifeUniverseEverything {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			num = scanner.nextInt();
			if(num == 42) {
				break;
			}
			System.out.println(num);
		}
	}

}
