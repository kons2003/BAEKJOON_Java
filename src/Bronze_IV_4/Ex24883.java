// 자동완성
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex24883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if (s.equals("N") || s.equals("n")) {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }
    }
}
