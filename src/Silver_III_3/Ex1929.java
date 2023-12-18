// 소수 구하기
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1929 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // N
        int m = Integer.parseInt(st.nextToken()); // M
        boolean[] isPrime = new boolean[m +1]; // 범위만큼 boolean 배열 만듦

        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true; // default는 false이므로 true로 바꿈
        }

        isPrime[0] = isPrime[1] = false; // 0, 1은 소수가 아님

        for (int i = 2; i <= Math.sqrt(m); i++) { // m ~ m의 제곱근까지
            // 소수면 isPrime[i] 제외함, 배수는 소수X
            if (isPrime[i]) {
                for (int j = i*i; j <= m; j += i) { // i이하의 수는 이미 검사했으므로 i*i부터 시작, j += i로 배수만큼 증가
                    isPrime[j] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = n; i <= m; i++) {
            if (isPrime[i])
                sb.append(i).append("\n");
        }

        System.out.print(sb);
    }
}
