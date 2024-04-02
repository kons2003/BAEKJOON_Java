// 피보나치
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Ex9711 {
    public static void main(String[] args) throws IOException {
        BigInteger[] sequence = new BigInteger[10001];

        sequence[0] = BigInteger.ZERO;
        sequence[1] = BigInteger.ONE;
        for (int i = 2; i <= 10000; i++) {
            sequence[i] = sequence[i - 2].add(sequence[i - 1]);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int x = 1; x <= t; x++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken()); // p번째 피보나치 숫자
            long q = Long.parseLong(st.nextToken()); // p를 나누는 수

            sb.append("Case #"+ x +": "+ sequence[p].mod(BigInteger.valueOf(q)) +"\n");
        }
        System.out.print(sb);
    }
}