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

    public static String isBalanced(String s) {
    Stack<Character> st = new Stack<>();
    for(int i =0; i<s.length(); i++)
    {
        if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
        {
            st.push(s.charAt(i));
        }
        else if(!st.isEmpty() && ((s.charAt(i)==']' && st.peek()=='[') ||
        (s.charAt(i)=='}' && st.peek()=='{') ||
        (s.charAt(i)==')' && st.peek()=='(')))
        {
            st.pop();
        }
        else {
            st.push(s.charAt(i));
        }
         
    }
    
    if(st.isEmpty()){
       // String f = "YES";
        return "YES";
    }
    else{
        return "NO";
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
