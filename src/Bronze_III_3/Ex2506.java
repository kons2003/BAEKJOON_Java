// 점수계산
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int score = 0;
        int result = 0;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int ox = Integer.parseInt(st.nextToken());

            if (ox == 1) {
                score++;
                result += score;
            } else {
                score = 0;
            }
        }

        System.out.println(result);
    }
}
