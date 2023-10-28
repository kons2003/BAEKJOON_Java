// 쉽게 푸는 문제
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int location = 0; // 구간 위치 저장할 공간
        int sum = 0; // 구간에 속하는 숫자의 합 저장하는 공간

        int a = Integer.parseInt(st.nextToken()); // a입력
        int b = Integer.parseInt(st.nextToken()); // b입력

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) { // i만큼 반복
                location++; // 현재 구간 계산

                // a~b의 구간일 시, 계산하는 코드
                if (a <= location && location <= b) {
                    sum += i; // 구간에 속하는 숫자 더함
                }
            }
        }

        System.out.println(sum); // 합 출력
    }
}
