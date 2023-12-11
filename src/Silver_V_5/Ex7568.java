// 덩치
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] person = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            person[i][0] = Integer.parseInt(st.nextToken()); // x, 몸무게
            person[i][1] = Integer.parseInt(st.nextToken()); // y, 키
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {

            int rank = 1;
            for (int j = 0; j < n; j++)

                if (person[i][0] < person[j][0] &&
                        person[i][1] < person[j][1] &&
                        i != j)
                    rank++;
            sb.append(rank + " ");
        }

        System.out.println(sb);
    }
}
