// 달팽이는 올라가고 싶다
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken()); // A, 낮에 올라가는 m
        long b = Long.parseLong(st.nextToken()); // B, 밤에 미끄러지는 m
        long v = Long.parseLong(st.nextToken()); // V, 나무 막대의 높이

        long days = (v - v % (a-b)) / (a-b) - a; // 정상에 도착하기 며칠 전으로 초기화

        v -= (a-b) * days; // 정상까지 남은 m 저장

        while (true) {
            days++;
            v -= a;
            if (v <= 0)
                break;
            v += b;
        }

        System.out.println(days);
    }
}
