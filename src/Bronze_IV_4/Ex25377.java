// 빵
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex25377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int minTime = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()); // 가는 시간
            int b = Integer.parseInt(st.nextToken()); // 빵 들어 오는 시간

            if (a <= b) {
                minTime = Math.min(minTime, b);
            }
        }

        if (minTime == 0) {
            System.out.println(-1);
        } else {
            System.out.println(minTime);
        }
    }
}
