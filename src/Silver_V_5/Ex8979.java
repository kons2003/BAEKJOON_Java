// 올림픽
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] medal = new int[n+1][4];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            int index = Integer.parseInt(st.nextToken()); // 국가
            medal[index][0] = 1; // 등수
            medal[index][1] = Integer.parseInt(st.nextToken()); // 금
            medal[index][2] = Integer.parseInt(st.nextToken()); // 은
            medal[index][3] = Integer.parseInt(st.nextToken()); // 동
        }

        for (int i = 1; i <= n; i++) {

            if (medal[k][1] < medal[i][1]) { // 금
                medal[k][0]++;

            } else if (medal[k][1] == medal[i][1]
                    && medal[k][2] < medal[i][2]) { // 은
                medal[k][0]++;

            } else if (medal[k][1] == medal[i][1]
                    && medal[k][2] == medal[i][2]
                    && medal[k][3] < medal[i][3]) { // 동
                medal[k][0]++;
            }
        }

        System.out.println(medal[k][0]);
    }
}
