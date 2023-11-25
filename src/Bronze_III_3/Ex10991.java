// 별 찍기 - 16
package Bronze_III_3;

import java.io.*;

public class Ex10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) { // 행
            for (int j = i; j <= 2*n-1; j++) { //열
                if (j == 1) {
                    bw.write("*");
               // } else if () {
                    
                }
            }

            bw.newLine();
        }
    }
}
