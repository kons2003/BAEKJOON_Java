// 개표
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex30868 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                if (n >= 5) {
                    n -= 5;
                    sb.append("++++ ");
                } else {
                    for (int j = 0; j < n; j++) {
                        sb.append("|");
                    }
                    n -= n;
                }
            }
            System.out.println(sb);
        }
    }
}
