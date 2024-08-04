// 주식
package Silver_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int currentBigNum = arr[n - 1]; // 현재 가장 큰 주가
            int currentNum; // 현재 주가
            long profit = 0; // 이익
            // 이익 계산 코드
            for (int j = n-2; j >= 0; j--) {
                currentNum = arr[j]; // 현재 주가 저장
                if (currentNum < currentBigNum) {
                    profit += currentBigNum - currentNum;
                } else {
                    currentBigNum = currentNum;
                }
            }

            // 최대 이익 출력
            System.out.println(profit);
        }
    }
}
