// Electric Bill
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex25881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int[] c = new int[n];

        for (int i = 0; i < c.length; i++) {
            c[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < c.length; i++) {
            int money = 0;
            if (c[i] <= 1000) {
                money = c[i] * a;
            } else if (c[i] > 1000) {
                money = 1000 * a + (c[i] - 1000) * b;
            }
            System.out.println(c[i] + " " + money);
        }
    }
}
