// J박스
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) { // 세로

            int n = Integer.parseInt(br.readLine());
            // 맨 위
            for (int j = 1; j <= n; j++) {
                sb.append("#");
            }
            sb.append("\n");

            // 맨 위와 맨 아래의 사이
            for (int j = 1; j <= n - 2; j++) {
                sb.append("#");
                for (int k = 1; k <= n - 2; k++) {
                    sb.append("J");
                }
                sb.append("#").append("\n");
            }

            // 맨 아래
            if (n > 1) { // 출력이 한 줄이 아닐때
                for (int j = 1; j <= n; j++) {
                    sb.append("#");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }

        sb.delete(sb.length() - 1, sb.length()); // 마지막 개행 제거

        System.out.print(sb);
    }
}
