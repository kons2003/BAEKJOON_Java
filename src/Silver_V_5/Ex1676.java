// 팩토리얼 0의 개수
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n >= 5) {
            cnt += n / 5;
            n /= 5;
        }

        System.out.println(cnt);
    }
}
