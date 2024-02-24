import java.io.*;
import java.util.*;

class Result {
	public static String findDay(int month, int day, int year) {
    	 Calendar calendar = Calendar.getInstance();
         calendar.set(year, month-1, day);
    	
    	if(year>2000 && year<3000) {
    		 String dayOfWeek = calendar.getDisplayName(
    		 Calendar.DAY_OF_WEEK,
    		 Calendar.LONG,
    		 Locale.US).toUpperCase();
    		 return dayOfWeek;
    	}
    	else {
    		return "0";
    	}
    }
}
public class SolutionTwelve {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
