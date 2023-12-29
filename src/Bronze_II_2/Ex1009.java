// 분산처리
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int power = 1;

            for (int j = 1; j <= b; j++) {
                power = power * a % 10;
            }

            if (power > 0) {
                sb.append(power).append("\n");
            } else { // power == 0
                sb.append(10).append("\n");
            }
        }

        System.out.print(sb);
    }
}
