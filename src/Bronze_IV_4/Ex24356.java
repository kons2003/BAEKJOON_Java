// ЧАСОВНИК
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex24356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());

        int time1 = t1 * 60 + m1; // t1, m1을 분으로 변환
        int time2 = t2 * 60 + m2; // t2, m2을 분으로 변환

        int m = 0; // 총 산책 시간 저장 변수
        int n = 0; // 완전히 한 바퀴 돈 횟수 저장 변수

        if (time1 > time2) { // 산책 끝난 시간이 24시가 이상 지난 상태
            m = (time2 + 60 * 24) - time1;
            n = (m - m % 30) / 30;
        } else if (time1 < time2) { // 산책 끝난 시간이 24시가 안 지난 상태
            m = time2 - time1;
            n = (m - m % 30) / 30;
        }

        System.out.printf("%d %d", m, n);
    }
}
