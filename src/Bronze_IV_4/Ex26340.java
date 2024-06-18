// Fold the Paper Nicely
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex26340 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()); // 번의 길이 1
            int b = Integer.parseInt(st.nextToken()); // 번의 길이 2
            int c = Integer.parseInt(st.nextToken()); // 접는 횟수

            System.out.printf("Data set: %d %d %d\n", a, b, c);

            for (int j = 0; j < c; j++) {
                if (a >= b) {
                    a /= 2;
                } else {
                    b /= 2;
                }
            }

            if (a > b) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(b + " " + a);
            }
            System.out.println();
        }
    }
}
