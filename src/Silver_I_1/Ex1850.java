// 최대공약수
package Silver_I_1;

import java.io.*;
import java.util.StringTokenizer;

public class Ex1850 {
    static long GCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder gcd = new StringBuilder();

        long a = Long.parseLong(st.nextToken()); // a의 1 개수
        long b = Long.parseLong(st.nextToken()); // b의 1 개수

        for (int i = 0; i < GCD(a, b); i++) {
            gcd.append(1);
        }

        System.out.println(gcd);
    }
}
