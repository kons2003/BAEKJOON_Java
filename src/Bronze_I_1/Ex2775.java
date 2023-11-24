// 부녀회장이 될테야
package Bronze_I_1;

import java.io.*;

public class Ex2775 {
    public static void main(String[] args) throws IOException {

        int[][] resident = new int[15][15];

        // 0층, 호마다 사는 거주자 수 저장
        for (int n = 1; n <= 14; n++) {
            resident[0][n] = n;
        }

        // 1층~14층, 호마다 사는 거주자 수 저장
        for (int k = 1; k <= 14; k++) { // 층
            for (int n = 1; n <= 14; n++) { // 호
                if (n != 1) { // 2호~14호 일때,
                    // k층 n호 = k층 (n-1)호 + (k-1)층 n호
                    resident[k][n] = resident[k][n - 1] + resident[k - 1][n];
                    continue;
                }
                // 1호 거주민 수는 항상 1명.
                resident[k][1] = 1;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(resident[k][n]);
        }
    }
}
