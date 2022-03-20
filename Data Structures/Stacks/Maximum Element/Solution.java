import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static class Node
    {
        Integer data;
        Integer max;
        
        public Node(Integer data,Integer max)
        {
            this.data = data;
            this.max = max;
        }
        
    }

    public static List<Integer> getMax(List<String> operations) {
    Stack<Node> stack = new Stack<Node>();
    List<Integer> res = new ArrayList<Integer>();
    for(String op : operations)
    {
        if(op.equals("2"))
        {
            stack.pop();
        }
        else if(op.equals("3"))
        {
            res.add(stack.peek().max);
        }
        else 
        {
            String x[] = op.split(" ");
            int num = Integer.parseInt(x[1]);
            if(stack.isEmpty())
            {
                stack.push(new Node(num,num));
            }
            else
            {
                stack.push(new Node(num, Integer.max(num, stack.peek().max)));
            }
        }
    }
    return res;

     
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
