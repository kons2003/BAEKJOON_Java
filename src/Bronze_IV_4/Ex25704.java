// 출석 이벤트
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        int min = p;

        if (5 <= n) {
            if (min > p - 500) {
                min = p - 500;
            }
        }

        if (10 <= n) {
            if (min > p - p / 10) {
                min = p - p / 10;
            }
        }

        if (15 <= n) {
            if (min > p - 2000) {
                min = p - 2000;
            }
        }

        if (20 <= n) {
            if (min > p - p / 4) {
                min = p - p / 4;
            }
        }

        if (min < 0) {
            min = 0;
        }

        System.out.println(min);
    }
}
