// Telemarketer or not?
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex16017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean check = true;
        int[] n = new int[4];

        for (int i = 0; i < 4; i++) {
            n[i] = Integer.parseInt(br.readLine());

            if ((i == 0 || i == 3) && !(8 <= n[i])) {
                check = false;
            }
            if (i == 2 && n[i] != n[i - 1]) {
                check = false;
            }
        }

        System.out.println(check ? "ignore" : "answer");
    }
}
