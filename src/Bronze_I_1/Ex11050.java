// 이항 계수 1
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(binomialCoefficient(n, k));
    }

    /* 이항 계수 C(n, k)
     n! / (k!(n - k)!)  0 <= k <= n
     0                  k < 0
     0                  k > n
     */
    static int binomialCoefficient(int n, int k) {

        if (0 <= k && k <= n) {
            return factorial(n) / (factorial(k) * factorial(n - k));
        }
        return 0;
    }

    static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
