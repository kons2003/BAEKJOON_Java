// 민주주의
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex30999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            int OCount = 0;

            for (int j = 0; j < m; j++) {
                if (arr[j] == 'O') {
                       OCount++;
                }
            }
            if (OCount > m / 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
