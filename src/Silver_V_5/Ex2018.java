// 수들의 합 5
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        int start = 1;
        int end = 1;
        int sum = 1;

        while (start <= end) {
            if (sum == n) { answer++; }
            if (sum < n) {
                end++;
                sum += end;
            } else if (sum >= n) {
                sum -= start;
                start++;
            }
        }

        System.out.println(answer);
    }
}
