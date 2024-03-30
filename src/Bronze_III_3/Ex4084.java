// Viva la Diferencia
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] a = new long[4];

        while (true) {
            int stopCheck = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                if (a[i] == 0) {
                    stopCheck++;
                }
            }
            if (stopCheck == 4) {
                break;
            }

            long[] b = new long[4];
            int count = 0;
            while (true) {
                if (a[0] == a[1]) {
                    if (a[1] == a[2]) {
                        if (a[2] == a[3]) {
                            break;
                        }
                    }
                }

                b[0] = Math.abs(a[0] - a[1]);
                b[1] = Math.abs(a[1] - a[2]);
                b[2] = Math.abs(a[2] - a[3]);
                b[3] = Math.abs(a[3] - a[0]);
                count++;

                a[0] = b[0];
                a[1] = b[1];
                a[2] = b[2];
                a[3] = b[3];

            }

            System.out.println(count);
        }
    }
}
