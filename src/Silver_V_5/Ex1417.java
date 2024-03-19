// 국회의원 선거
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] vote = new int[n];

        for (int i = 0; i < n; i++) {
            vote[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;

        while (true) {
            int maxIndex = 0;
            int max = vote[0];

            for (int i = 0; i < n; i++) {
                if (vote[i] >= max) {
                    maxIndex = i;
                    max = vote[i];
                }
            }

            if (maxIndex == 0) {
                break;
            }
            vote[maxIndex]--;
            vote[0]++;
            cnt++;
        }

        System.out.println(cnt);
    }
}
