// 도미노
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            for (int j = 0; j <= n; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
