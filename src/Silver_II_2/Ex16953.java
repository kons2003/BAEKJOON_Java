// A → B
package Silver_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 1;
        while (b > a) {
            if (b % 10 == 1) {
                b /= 10;
                count++;
            } else if (b % 2 == 0) {
                b /= 2;
                count++;
            } else { // 1이 아닌 홀수는 가능한 연산이 없다.
                count = -1;
                break;
            }
        }
        if (b < a) {
            count = -1;
        }

        System.out.println(count);
    }
}
