// 수 정렬하기
package Bronze_II_2;

import java.io.*;
import java.util.Arrays;

public class Ex2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {

            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        for (int i = 0; i < n; i++) {

            bw.write(String.valueOf(num[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
