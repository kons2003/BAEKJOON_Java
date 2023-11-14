// 홀수
package Bronze_III_3;

import java.io.*;

public class Ex2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[7];
        int oddSum = 0;
        int oddMin = 0;

        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (arr[i] % 2 != 0) {
                oddSum += arr[i];

                if (arr[i] < oddMin || oddMin == 0) {
                    oddMin = arr[i];
                }
            }
        }

        if (oddSum == 0) {
            bw.write(String.valueOf(-1));
            bw.newLine();
        } else {
            bw.write(String.valueOf(oddSum));
            bw.newLine();
            bw.write(String.valueOf(oddMin));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
