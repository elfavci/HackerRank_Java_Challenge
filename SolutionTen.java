import java.util.*;

public class SolutionTen {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int b,h;
			b=scanner.nextInt();
			h=scanner.nextInt();
			if(b>=(-100) && b<=100 && h>=(-100) && h<=100) {
				if(b>0 && h>0) {
					System.out.println(b*h);
				}
				else {
					System.out.println("java.lang.Exception: Breadth and height must be positive");
				}
			}
		}

	}

}
