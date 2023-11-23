// 벌집
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstRoom = 1; // 층의 첫 방 숫자
        int lastRoom = 1; // 층의 끝 방 숫자
        int cnt = 1; // n번 방까지 최소 개수의 방 카운트
        long n = Long.parseLong(br.readLine());

        int i = 1;
        while (true) {
            // n이 첫 방과 끝 방 사이의 수면 cnt 출력 후, 멈춤
            if (firstRoom <= n && n <= lastRoom) {
                System.out.println(cnt);
                break;
            }

            firstRoom = lastRoom + 1;
            lastRoom += 6 * i;
            cnt++;
            i++;
        }
    }
}
