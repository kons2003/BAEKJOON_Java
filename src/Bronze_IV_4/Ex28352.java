// 10!
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex28352 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine()); // N값 저장
        long facN = 1L; // N! 결과값 저장

        // N! 계산 코드
        for (long i = 1L; i <= n; i++) {
            facN *= i;
        }

        // N!과 같은 주 계산 코드
        long week = facN / (7 * 24 * 60 * 60);

        System.out.println(week);
    }
}
