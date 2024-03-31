// 전투 드로이드 가격
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex5361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        double[] price = {350.34, 230.90, 190.55, 125.30, 180.90};

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double sum = 0.0;
            for (int j = 0; j < 5; j++) {
                sum += price[j] * Double.parseDouble(st.nextToken());
            }

            System.out.printf("$%.2f\n", sum);
        }

    }
}
