// 배수와 약수
package Bronze_III_3;

import java.io.*;
import java.util.StringTokenizer;

public class Ex5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, m;

        while ((n = Integer.parseInt(st.nextToken())) != 0
                && (m = Integer.parseInt(st.nextToken())) != 0) {

            st = new StringTokenizer(br.readLine());

            if (m % n == 0) {
                bw.write("factor");
                bw.newLine();
            } else if (n % m == 0) {
                bw.write("multiple");
                bw.newLine();
            } else {
                bw.write("neither");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
