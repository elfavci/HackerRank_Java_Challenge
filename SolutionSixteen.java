import java.util.Scanner;

public class SolutionSixteen {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String word=inp.next();
        String reverseWord=new StringBuilder(word).reverse().toString();
        if(word.equals(reverseWord)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
