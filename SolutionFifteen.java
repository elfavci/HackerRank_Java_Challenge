import java.util.Scanner;

public class SolutionFifteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        if(S.length()>=1 && S.length()<=100) {
            String word = S.substring(start, end);
            System.out.println(word);
        }
    }
}
