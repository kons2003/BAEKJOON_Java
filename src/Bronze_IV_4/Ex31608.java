// ハミング距離 (Hamming Distance)
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex31608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();
        char[] t = br.readLine().toCharArray();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] != t[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
