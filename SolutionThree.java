//if-else
import java.io.*;
public class SolutionThree {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if(N%2!=0){
            System.out.println("Weird");
        } 
        else if(N>=2 && N<=5 ){
            System.out.println("Not Weird");
        }
        else if(N>=6 && N<=20){
            System.out.println("Weird");
        } 
              
        else if(N>20){
            System.out.println("Not Weird");
        }
	}
}
