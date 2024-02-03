// 막대기
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int stick = 64;
        int min = 64;
        int sum = 0;
        int cnt = 1;


        stick /= 2;
        while (sum != x) {
            if (stick + min > x) {

                if (min >= x) {
                    min /= 2;
                } else {
                    sum += min;
                    cnt++;
                    stick /= 2;
                    min = stick;
                }
            } else {
                sum += stick;
            }

        }
    }
}
