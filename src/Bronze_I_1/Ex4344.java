// 평균은 넘겠지
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int[] score = new int[n];
            double sum = 0;

            for (int j = 0; j < n; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }
            double avg = sum / n;

            double cnt = 0;
            for (int k : score) {
                if (k > avg) {
                    cnt++;
                }
            }

            double result = cnt / n * 100;
            System.out.printf("%.3f%%\n", result);
        }
    }
}
