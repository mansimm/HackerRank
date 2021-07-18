import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<String> s1 = new Stack();
            if(input.isEmpty())
            {
                System.out.println(input.isEmpty());
                continue;
            }
            for(int i=0;i<input.length();i++)
            {
                String x = "";
                String y = input.charAt(i)+"";
                if(y.equals("}"))
                {
                    x = "{";
                }
                else if(y.equals(")"))
                {
                    x= "(";
                }
                else if(y.equals("]"))
                {
                    x="[";
                }
                
                if(x.isEmpty())
                {
                    s1.push(y);
                    //System.out.println(input+" after push = "+s1);
                }
                else if(!s1.isEmpty() && s1.peek().equals(x))
                {
                    
                    s1.pop();
                    //System.out.println(input+" after pop = "+s1);

                }
                else//empty stack
                {
                    s1.push(y);
                }
                
                
            }
            System.out.println(s1.isEmpty());
		}
		
	}
}



