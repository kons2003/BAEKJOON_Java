// 치킨댄스를 추는 곰곰이를 본 임스 2
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex26068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x;
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(br.readLine().replace("D-", ""));

            if (x <= 90) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
