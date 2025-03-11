import java.util.*;
public class SolutionFourteen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String A=input.nextLine();
        String B=input.nextLine();
        input.close();
            int lenTotal;
            int lenA= A.length();
            int lenB= B.length();
            lenTotal=lenA+lenB;
            System.out.println(lenTotal);

            int result=A.compareTo(B);
            if(result<0){
                System.out.println("No");
            }
            else if(A.equals(B)){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        System.out.println(capitalize(A)+" "+capitalize(B));


    }
    public static String capitalize(String inp){
        char firstLet=inp.charAt(0);
        char capitalFirst=Character.toUpperCase(firstLet);
        return inp.replace(inp.charAt(0),capitalFirst);
    }
}