// 경제학과 정원영
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2546 {
    public static void main(String[] args) throws IOException {
        // 테스트 케이스 수 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        // t만큼 반복
        for (int i = 0; i < t; i++) {
            br.readLine(); // 빈 줄

            // 각각 수강생 수 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(st.nextToken()); // C언어 IQ
            int m = Integer.parseInt(st.nextToken()); // 경제학 원론 IQ

            int[] cIQs = new int[n];
            double cSum = 0;
            double eSum = 0;

            // c언어 수강생 IQ 입력
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                cIQs[j] = Integer.parseInt(st.nextToken());
                cSum += cIQs[j];
            }

            // 경제학 원론 수강생 IQ 입력
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                eSum += Integer.parseInt(st.nextToken());
            }

            // 두 과목의 평균을 올려줄 수 있는지 계산
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (cIQs[j] < cSum / n && cIQs[j] > eSum / m) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
