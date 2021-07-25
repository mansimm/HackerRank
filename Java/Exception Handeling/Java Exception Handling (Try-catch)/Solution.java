import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try
        {
            int x = sc.nextInt();sc.nextLine();
            int y = sc.nextInt();
            //System.out.println(x+"   "+y);
            
            int ans = x/y;
            System.out.println(ans);
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
