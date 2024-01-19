// 수들의 합
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long sum = 0;
        long cnt = 0;

        while (true) {
            cnt++;
            sum += cnt;
            if (sum > s)
                break;
        }

        if (cnt > 1) {
            System.out.println(cnt - 1);
        } else {
            System.out.println(cnt);
        }
    }
}
