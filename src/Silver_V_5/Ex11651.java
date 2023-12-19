// 좌표 정렬하기 2
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] coordinate = new int[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            coordinate[i][1] = Integer.parseInt(st.nextToken()); // x
            coordinate[i][0] = Integer.parseInt(st.nextToken()); // y
        }

        Arrays.sort(coordinate, (o1, o2) -> {
            if (o1[0] == o2[0])
                return o1[1] - o2[1]; // y 기준 오름차순 정렬
            else
                return o1[0] - o2[0]; // x 기준 오름차순 정렬
        });
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(coordinate[i][1]).append(" ").append(coordinate[i][0]).append("\n");

        System.out.print(sb);
    }
}
