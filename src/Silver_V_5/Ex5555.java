// 반지
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String ring;
        String ringPlus;
        int cnt = 0;

        for (int i = 0; i < n; i++) {

            ring = br.readLine();
            ringPlus = ring.substring(ring.length() - (s.length() - 1))
                    + ring.substring(0, s.length());

            if (ring.contains(s)) {
                cnt++;
            } else if (ringPlus.contains(s)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
