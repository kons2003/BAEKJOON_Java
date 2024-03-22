// 빅데이터 vs 정보보호 vs 인공지능
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex30957 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        int bCnt = 0;
        int sCnt = 0;
        int aCnt = 0;

        for (int i = 0; i < n; i++) {
            if (str[i] == 'B') {
                bCnt++;
            } else if (str[i] == 'S') {
                sCnt++;
            } else if (str[i] == 'A') {
                aCnt++;
            }
        }

        int max = Math.max(bCnt, Math.max(sCnt, aCnt));

        if (bCnt == sCnt && sCnt == aCnt) {
            System.out.println("SCU");
        } else {
            if (bCnt == max) {
                System.out.print("B");
            }
            if (sCnt == max) {
                System.out.print("S");
            }
            if (aCnt == max) {
                System.out.print("A");
            }
        }
    }
}
