// 아름다운 수
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String x = br.readLine();

            int count = 0;
            for (int j = 0; j <= 9; j++) {
                if (x.contains(String.valueOf(j))) {
                    x.replaceAll(String.valueOf(j), "");
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
