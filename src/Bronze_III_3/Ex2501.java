// 약수 구하기
package Bronze_III_3;

import java.io.*;
import java.util.StringTokenizer;

public class Ex2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i;
        int cnt = 0;
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
            if (k == cnt) {
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if (cnt != k) {
            bw.write(String.valueOf(0));
        } else {
            bw.write(String.valueOf(i));
        }
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
