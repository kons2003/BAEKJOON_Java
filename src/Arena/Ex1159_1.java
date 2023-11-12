// 2023 Sogang Programming Contest Open (Master) · Arena #12
// A번 - Knob
package Arena;

import java.io.*;
import java.util.StringTokenizer;

public class Ex1159_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] l = new int[t];
        int[] r = new int[t];
        int fun = 0;

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            l[i] = Integer.parseInt(st.nextToken());
            r[i] = Integer.parseInt(st.nextToken());

            if (i >= 1) {
                if (l[i] == l[i - 1] && l[i] != 0) {
                    fun++;
                }
                if (r[i] == r[i - 1] && r[i] != 0) {
                    fun++;
                }
            }

            if (l[i] == r[i] && l[i] != 0 && r[i] != 0) {
                fun++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(fun));

        bw.flush();
        bw.close();
    }
}
