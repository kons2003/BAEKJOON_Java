// 2차원 배열의 합
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        int sum;
        int i, j, x, y;
        int k = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < k; l++) {
            st = new StringTokenizer(br.readLine());

            sum = 0;
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for (int o = i -1 ; o <= x - 1; o++)
                for (int p = j  - 1; p <= y - 1; p++)
                    sum += arr[o][p];

            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
