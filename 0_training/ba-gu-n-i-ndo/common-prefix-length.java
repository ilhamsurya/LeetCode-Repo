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

    /*
     * Complete the 'commonPrefix' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY inputs as parameter.
     */

    public static List<Integer> commonPrefix(List<String> inputs) {
    // Write your code here
        List<Integer>list = new ArrayList<>();
        for(String str: inputs){
            suffixString(str,str.length(),list);
        }
        return list;
    }
    
    public static void suffixString(String str, int n, List<Integer>list){
        int count = 0, param = 0;
        String suffix = str;
        for(int i=suffix.length(); i > 0; i--){
            suffix = str.substring(param++);
            for(int j=0; j<suffix.length();j++){
                if(suffix.charAt(j) == str.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
        }
        list.add(count);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int inputsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> inputs = IntStream.range(0, inputsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.commonPrefix(inputs);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
