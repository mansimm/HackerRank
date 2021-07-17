import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList();
        int n = sc.nextInt();sc.nextLine();
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            l.add(Integer.parseInt(arr[i]));
        } 
        int q = sc.nextInt();sc.nextLine();
        
        for(int i=0;i<q;i++)
        {
            String op = sc.nextLine();
            if(op.equals("Insert"))
            {
                String s1 = sc.nextLine();
                String[] arr2 = s1.split(" ");
                int x = Integer.parseInt(arr2[0]);
                int y = Integer.parseInt(arr2[1]);
                
                l.add(x,y);
            }
            else if(op.equals("Delete"))
            {
                String s1 = sc.nextLine();
                int x = Integer.parseInt(s1);
               
                l.remove(x);
            }
            
        }
        
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
}
