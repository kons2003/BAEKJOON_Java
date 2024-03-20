// 분수좋아해?
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10474 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int numerator = Integer.parseInt(st.nextToken());
            int denominator = Integer.parseInt(st.nextToken());

            if (numerator == 0 && denominator == 0) {
                break;
            }

            System.out.printf("%d %d / %d\n", numerator/denominator, numerator%denominator, denominator);
        }
    }
}
