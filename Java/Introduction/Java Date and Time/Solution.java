import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(Integer.valueOf(year), Integer.valueOf(month) - 1, Integer.valueOf(day));
        
        String week_day = "";
        switch(c.get(Calendar.DAY_OF_WEEK)){
            case 1:
                week_day = "Sunday";
                break;
            case 2:
                week_day = "Monday";
                break;
            case 3:
                week_day = "Tuesday";
                break;
            case 4:
                week_day = "Wednesday";
                break;
            case 5:
                week_day = "Thursday";
                break;
            case 6:
                week_day = "Friday";
                break;
            case 7:
                week_day = "Saturday";
                break;
        }
        return week_day.toUpperCase();
    }

}

public class Solution {
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
