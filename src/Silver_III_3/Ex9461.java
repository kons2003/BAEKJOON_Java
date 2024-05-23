// 파도반 수열
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9461 {
    public static void main(String[] args) throws IOException {
        long[] p = new long[101];

        p[1] = p[2] = p[3] = 1;
        for (int i = 4; i <= 100; i++) {
            p[i] = p[i - 3] + p[i - 2];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(p[n]).append("\n");
        }
        System.out.print(sb);
    }
}
