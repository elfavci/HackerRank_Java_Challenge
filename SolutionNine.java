import java.util.Scanner;

public class SolutionNine {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int line=1;
			while(scanner.hasNext()) {
				String str=scanner.nextLine();
				System.out.println(line+" "+str);
				line++;
				
				//if(str.equals("q")) {
				//	break;
				//}
			}
		}	
	}
}
