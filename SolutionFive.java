import java.util.*;

public class SolutionFive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String str = scanner.next();
			int number = scanner.nextInt();
			if(str.length()<=10 && number>=0 && number<=999) {
			System.out.printf("%-15s%03d\n", str, number);
			}
			else {
				break;
			}
		}
		System.out.println("================================");
		scanner.close();
	}
}
