// 거울, 오! 거울
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();

            if (s.equals("***")) {
                break;
            }

            StringBuffer sb = new StringBuffer(s);
            String reverse = sb.reverse().toString();

            System.out.println(reverse);

        }
    }
}
