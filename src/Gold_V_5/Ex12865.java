// 평범한 배낭
package Gold_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 물품의 수
        int k = Integer.parseInt(st.nextToken()); // 버틸 수 있는 무게

        int sumV = 0;
        int maxV = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken()); // 무게
            int v = Integer.parseInt(st.nextToken()); // 가치


        }

    }
}
