// Mad Scientist
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4580 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // k가 0이 아니면 반복
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st.nextToken()); // 시퀀스의 최대 값
            if (k == 0) { break; }
            
            int[] p = new int[k+1]; // 시퀀스 저장할 배열 생성

            // 1~k까지 위상의 수 입력
            for (int i = 1; i <= k; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }

            // 실험 측정값 sb에 저장
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= k; i++) {
                if (i == 1) { // 1일떄
                    for (int j = 0; j < p[i]; j++) {
                        sb.append(i + " ");
                    }
                    continue;
                }

                int x = p[i] - p[i - 1]; // 현재 위상의 수에서 이전 값만큼 빼서 저장
                for (int j = 0; j < x; j++) {
                    sb.append(i + " ");
                }
            }

            // 실험 측정값 출력
            System.out.println(sb);
        }
    }
}
