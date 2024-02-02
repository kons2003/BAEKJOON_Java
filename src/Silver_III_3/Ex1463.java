// 1로 만들기
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());

        twoFirst(x);
        threeFirst(x);

        System.out.println(Math.min(twoCount, threeCount));
    }

    static int twoCount = 0;
    static int threeCount = 0;

    static void twoFirst(int x) {

        while (x > 1) {
            if (x % 2 == 0) {
                x /= 2;
                twoCount++;
            } else {
                x -= 1;
                twoCount++;
            }
        }
        while (x > 1) {
            if (x % 3 == 0) {
                x /= 3;
                twoCount++;
            } else if (x % 2 == 0) {
                x /= 2;
                twoCount++;
            } else {
                x -= 1;
                twoCount++;
            }
        }
    }

    static void threeFirst(int x) {

        while (x > 1) {
            if (x % 3 == 0) {
                x /= 3;
                threeCount++;
                break;
            } else {
                x -= 1;
                threeCount++;
            }
        }
        while (x > 1) {
            if (x % 3 == 0) {
                x /= 3;
                threeCount++;
            } else if (x % 2 == 0) {
                x /= 2;
                threeCount++;
            } else {
                x -= 1;
                threeCount++;
            }
        }
    }
}
