// 윷놀이
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;

            for (int j = 0; j < 4; j++) {
                result += Integer.parseInt(st.nextToken());
            }

            // 0 = 배, 1 = 등
            if (result == 3) {
                System.out.println("A"); // 도
            } else if (result == 2) {
                System.out.println("B"); // 개
            } else if (result == 1) {
                System.out.println("C"); // 걸
            } else if (result == 0) {
                System.out.println("D"); // 윷
            } else if (result == 4) {
                System.out.println("E"); // 모
            }
        }
    }
}
