import java.util.*;

public class SolutionSeven{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int total;
        int temp=0;
        int t=in.nextInt();
        if(t>=0 && t<=500) {
        	for(int i=0;i<t;i++){
        		int a = in.nextInt();
        		int b = in.nextInt();
        		int n = in.nextInt();
           
            	if(a>=0 && a<=50 && b>=0 && b<=50 && n>=0 && n<=15) {
            		for(int j=0;j<=n-1;j++) {
            			total=(int) Math.pow(2, j)*b;
            			temp=total+temp;
            			System.out.print((temp+a)+" ");
            		}
            		System.out.println();
            		temp=0;
            	}
            }  
        }
        else {
        	System.out.println("Input values are out of range.");
        }
        in.close();
    }
}
