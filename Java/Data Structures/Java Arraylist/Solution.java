import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();sc.nextLine();
        
        List<List<Integer>> m = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> t = new ArrayList();
            String s = sc.nextLine();
            String[] temp = s.split(" ");
            
            int d = Integer.parseInt(temp[0]);
            
            for(int j=1;j<=d;j++)
            {
                t.add(Integer.parseInt(temp[j]));
            }
            m.add(t);
            
        }
        
         int q = sc.nextInt(); sc.nextLine();
        
         for(int i=0;i<q;i++)
         {
            
             String s1 = sc.nextLine();
             String[] a = s1.split(" ");
             int x = Integer.parseInt(a[0]);
             int y = Integer.parseInt(a[1]);
             
             if(m.size()<x)
             {
                 System.out.println("ERROR!");
             }else
             {
                List<Integer> z = m.get(x-1);
                if(z.isEmpty() || z.size()==0 || z.size()<(y))
                {
                    System.out.println("ERROR!");
                }
                else
                {
                    System.out.println(z.get(y-1));
                }
             }
         }

    }
}
