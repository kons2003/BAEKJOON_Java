// 그게 무슨 코드니..
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex31495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String answer = "";

        char start = str.charAt(0);
        char end = str.charAt(str.length()-1);

        if (start == '"' && end == '"' && str.length() <= 2) {
            answer = "CE";
        }else if(start == '"' && end == '"'){
            answer = str.substring(1, str.length()-1);
        }else{
            answer = "CE";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
