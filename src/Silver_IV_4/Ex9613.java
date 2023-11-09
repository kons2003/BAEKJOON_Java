// GCD 합
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex9613 {
    static int GCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int gcd = 0;
        int a, b;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());

            for (int j = 0; j < n; j++) {
                b = Integer.parseInt(st.nextToken());

                a = GCD(a, b);
                gcd += a;
            }
            System.out.println(gcd);
        }
    }
}
