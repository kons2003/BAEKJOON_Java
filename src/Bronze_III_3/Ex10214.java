// Baseball
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int yCnt = 0, kCnt = 0;

            for (int j = 0; j < 9; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                yCnt += Integer.parseInt(st.nextToken());
                kCnt += Integer.parseInt(st.nextToken());
            }

            if (yCnt > kCnt) {
                System.out.println("Yonsei");
            } else if (yCnt < kCnt) {
                System.out.println("Korea");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
