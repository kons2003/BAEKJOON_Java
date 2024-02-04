// 1로 만들기
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        System.out.println(recur(n, 0));
    }

    static int recur(int n, int count) {

        if (n < 2) {
            return count;
        }
        return Math.min(recur(n / 2, count + 1 + (n % 2)), recur(n / 3, count + 1 + (n % 3)));
    }
}
