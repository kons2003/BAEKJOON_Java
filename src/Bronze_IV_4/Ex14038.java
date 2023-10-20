// Tournament Selection
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0; // Win 횟수 저장할 곳

        for (int i = 0; i < 6; i++) {
            String result = br.readLine(); // W, L 입력받음

            if (result.equals("W")) { // W시, cnt 증가
                cnt++;
            }
        }

        // 배치할 그룹 출력
        if (cnt == 5 || cnt == 6) {
            System.out.println(1);
        } else if (cnt == 3 || cnt == 4) {
            System.out.println(2);
        } else if (cnt == 1 || cnt == 2) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}
