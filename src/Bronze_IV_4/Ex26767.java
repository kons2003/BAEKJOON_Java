// Hurra!
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex26767 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                System.out.println("Wiwat!");
            } else if (i % 7 == 0) {
                System.out.println("Hurra!");
            } else if (i % 11 == 0) {
                System.out.println("Super!");
            } else {
                System.out.println(i);
            }
        }
    }
}
