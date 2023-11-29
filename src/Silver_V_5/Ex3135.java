// 라디오
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hz = 0; // 지정된 주파수
        int cnt = 0; // 눌러야 할 버튼수

        int a = Integer.parseInt(st.nextToken()); // 현재 주파수
        int b = Integer.parseInt(st.nextToken()); // 듣고 싶은 주파수
        int n = Integer.parseInt(br.readLine()); // n개의 버튼

        int min = Math.max(a, b) - Math.min(a, b); // 듣고 싶은 주파수와 더 가까운 주파수의 차수를 저장할 변수
        int start = a; // 현재 주파수와 지정된 주파수들 중에서 시작할 주파수를 저장할 변수

        for (int i = 0; i < n; i++) { // 버튼수 만큼 반복
            hz = Integer.parseInt(br.readLine());

            // 지정된 주파수가 기존 가까운 주파수보다 더 가까우면 true
            if (Math.max(hz, b) - Math.min(hz, b) < min) {
                min = Math.max(hz, b) - Math.min(hz, b); // 남은 주파수 차수 저장
                start = hz; // 더 가까운 주파수 저장
            }
        }

        // 시작 주파수가 현재 주파수가 아닐 시(= 지정 주파수 일시)
        if (start != a) {
            b -= start;
            cnt++;
        // 시작 주파수가 현재 주파수일 시
        } else {
            b -= start;
        }

        // 듣고 싶은 주파수가 될 때까지
        while (b != 0) {
            if (b > 0) {
                b--;
                cnt++;
            } else {
                b++;
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}
