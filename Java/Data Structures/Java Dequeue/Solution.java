    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new LinkedList<>();
            Map<Integer,Integer> map=new HashMap();
            int n = in.nextInt();
            int m = in.nextInt();
            
            int max = 0;
            
            
            for (int i = 0; i < n; i++) {
                
                if(i>=(m))
               {
                  
                   int old = (int) deque.poll();
                   if(map.get(old)==1)
                   {
                       map.remove(old);
                   }
                   else
                   {
                       map.put(old,map.get(old)-1);
                   }
                   
               }
                int num = in.nextInt();
               deque.add(num);
               map.merge(num,1,Integer::sum);
               
               max = Math.max(max,map.size());
              
              
            }
            System.out.println(max);
           
        }
    }



