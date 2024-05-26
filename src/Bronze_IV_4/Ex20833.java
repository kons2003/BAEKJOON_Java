// Kuber
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex20833 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            result += (int) Math.pow(i, 3);
        }

        System.out.println(result);
    }
}
