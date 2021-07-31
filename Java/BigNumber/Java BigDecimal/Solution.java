import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s,(String x,String y)->{
            if(x!=null && y!=null )
            {
                BigDecimal a = new BigDecimal(x);
                BigDecimal b = new BigDecimal(y);
                return b.compareTo(a);
            }
            return 0;
        });           
        //output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
