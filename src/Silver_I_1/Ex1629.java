// 곱셈
package Silver_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1629 {

    static long c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken()); // 자연수
        long b = Long.parseLong(st.nextToken()); // 지수
        c = Long.parseLong(st.nextToken()); // 나누는 수

        System.out.println(pow(a, b));
    }

    static long pow(long a, long exponent) {
        if (exponent == 1) { // 지수가 1일떄
            return a % c;
        }
        long temp = pow(a, exponent / 2);

        if (exponent % 2 == 1) { // 지수가 홀수일떄
            return (temp * temp % c) * a % c;
        }
        return temp * temp % c; // 지수가 짝수일때
    }
}
