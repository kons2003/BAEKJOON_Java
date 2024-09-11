// 화성 수학
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex5355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        // @: *3 , %: +5 , #: -7
        for (int i = 0; i < t; i++) {
            String s = br.readLine();

            StringTokenizer st = new StringTokenizer(s);

            double num = Double.parseDouble(st.nextToken());

            while (st.hasMoreTokens()) {
                String operator = st.nextToken();

                if (operator.equals("@")) {
                    num *= 3;
                } else if (operator.equals("%")) {
                    num += 5;
                } else if (operator.equals("#")) {
                    num -= 7;
                }
            }

            System.out.printf("%.2f\n", num);
        }
    }
}
