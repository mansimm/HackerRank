import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        for(int i=0;i<m;i++)
        {
            String in = sc.nextLine();
            
            
            String op = sc.next();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            
            if(op.equals("AND"))
            {
                if(x1==1)
                   b1.and(b2);
                else
                    b2.and(b1);
            }
            else if(op.equals("OR"))
            {
                if(x1==1)
                   b1.or(b2);
                else
                    b2.or(b1);
            }
            else if(op.equals("XOR"))
            {
                if(x1==1)
                   b1.xor(b2);
                else
                    b2.xor(b1);
            }
            else if(op.equals("FLIP"))
            {
                if(x1==1)
                   b1.flip(x2);
                else
                    b2.flip(x2);
            }
            else if(op.equals("SET"))
            {
                if(x1==1)
                   b1.set(x2);
                else
                    b2.set(x2);
            }            
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
    }
}
