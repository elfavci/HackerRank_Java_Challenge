import java.util.*;

public class SolutionEleven {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n=scanner.nextInt();
			if(n>=-100 && n<=100) {
				String number = n + " ";
				//System.out.println(number);
				System.out.println("Good job");
			}
			else {
				System.out.println("Wrong answer");
			}
		}

	}

}
