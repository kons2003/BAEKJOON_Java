// 이진수
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int location = 0;
            int n = Integer.parseInt(br.readLine());

            while (n > 0) {
                if (n % 2 != 0) {
                    System.out.print(location + " ");
                    n -= 1;
                }
                n /= 2;
                location++;
            }
        }
    }
}
