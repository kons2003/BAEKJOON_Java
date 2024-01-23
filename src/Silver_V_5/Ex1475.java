// 방 번호
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1475 {

    static int[] num = new int[9]; // 0 ~ 8
    static int cnt = 0;

    static void plusSet() {
        cnt++;
        for (int i = 0; i < num.length; i++) {
            num[i] += 1;
            if (i == 6) { num[i] += 1; } // 6은 2개 저장
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] room = br.readLine().toCharArray();

        for (int i = 0; i < room.length; i++) {

            int n = (int) room[i] - '0';
            if (n == 9) { n = 6; } // 9는 6으로 대체

            if (num[n] == 0) { plusSet(); } // 해당 숫자가 없으면 +1
            num[n] -= 1;
        }

        System.out.println(cnt);
    }
}
