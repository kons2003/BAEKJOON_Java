// 다음수
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());

            if (a1 == 0 && a2 == 0 && a3 == 0) break;

            if (a2 - a1 == a3 - a2) {
                System.out.printf("AP %d\n", a3 + (a2 - a1));
            } else if (a2 / a1 == a3 / a2) {
                System.out.printf("GP %d\n", a3 * (a2 / a1));
            }
        }
    }
}
