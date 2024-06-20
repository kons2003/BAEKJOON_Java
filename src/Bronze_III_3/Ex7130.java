// Milk and Honey
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex7130 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken()); // milk
        int h = Integer.parseInt(st.nextToken()); // honey

        int n = Integer.parseInt(br.readLine()); // number of fields

        int total = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int c = Integer.parseInt(st.nextToken()); // cow
            int b = Integer.parseInt(st.nextToken()); // bee

            total += Math.max(m * c, h * b);
        }

        System.out.println(total);
    }
}
