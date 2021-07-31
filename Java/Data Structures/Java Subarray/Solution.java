import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();sc.nextLine();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i=1;i<=n;i++)
        {
            int len = 0;
            int start = 0;
            while(true)
            {
                if(len>0)
                {
                    len = start +1;
                }
                
                if(len+i-1>=n)
                {
                    break;
                }
                
                int sum = 0;
                start = len;
                while(len<start+i)
                {
                    //System.out.print(arr[len]+"+");
                    sum += arr[len++];
                    
                }
                if(sum<0)
                {
                    cnt++;
                }
                //System.out.print("="+sum+"\n");
            }
            
        }
        System.out.println(cnt);
    }
}
