// 모비스
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex28074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if (s.contains("M")
                && s.contains("O")
                && s.contains("B")
                && s.contains("I")
                && s.contains("S")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
