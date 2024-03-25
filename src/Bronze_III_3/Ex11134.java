// 쿠키애호가
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken()); // 가진 쿠키 개수
            int c = Integer.parseInt(st.nextToken()); // 먹는 쿠키 개수

            if (n % c == 0) {
                System.out.println(n / c);
            } else {
                System.out.println(n / c + 1);
            }
        }
    }
}
