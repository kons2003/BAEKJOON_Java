// 캠핑
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int i = 0;
        int l, p, v;
        int result;

        while (true) {
            st = new StringTokenizer(br.readLine());

            i++;
            l = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            if (l == 0 && p == 0 && v == 0) { break; }

            result = v / p * l;
            if (v % p / l >= 1) {
                result += l;
            } else {
                result += v % p;
            }

            System.out.printf("Case %d: %d\n", i, result);
        }
    }
}
