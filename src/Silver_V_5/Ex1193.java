// 분수찾기
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int check = 0; // 배열 층 수
        int maxNumerator = 0; // 최대 분자
        int maxDenominator = 0; // 최대 분모
        int numerator = 0; // 분자
        int denominator = 0; // 분모
        int cnt = 0; // 몇 번째인지 카운트 변수
        int x = Integer.parseInt(br.readLine());

        while (cnt < x) {
            check++;
            maxNumerator++;
            maxDenominator++;

            if (check % 2 == 0) { // 짝수일 때, 위부터 시작
                numerator = 0;
                denominator = maxDenominator + 1;

                while (denominator > 1) {
                    cnt++;
                    numerator++;
                    denominator--;
                    if (cnt == x) break;
                }
            } else { // 홀수일 때, 왼쪽부터 시작
                numerator = maxNumerator + 1;
                denominator = 0;

                while (numerator > 1) {
                    cnt++;
                    numerator--;
                    denominator++;
                    if (cnt == x) break;
                }
            }
        }

        System.out.printf("%d/%d\n", numerator, denominator);
    }
}
