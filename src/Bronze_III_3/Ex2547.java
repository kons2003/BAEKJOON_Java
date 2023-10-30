// 사탕 선생 고창영
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Ex2547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            //모든 사탕의 합을 저장해줄 변수 선언
            BigInteger sum = new BigInteger("0");
            //테스트 케이스마다 한 라인을 통채로 비운다.
            String S = br.readLine();
            BigInteger N = new BigInteger(br.readLine());

            for(int j = 0; j < N.intValue(); j++) {
                BigInteger M = new BigInteger(br.readLine());
                sum = sum.add(M);
            }
            //삼항연산자 사용
            String result = ((sum.remainder(N)).compareTo(BigInteger.ZERO) == 0) ? "YES" : "NO";

            System.out.println(result);
        }
    }
}
