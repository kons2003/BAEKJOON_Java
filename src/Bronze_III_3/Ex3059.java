// 등장하지 않는 문자의 합
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex3059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < t; i++) {

            Arrays.fill(alphabet, false);

            char[] s = br.readLine().toCharArray();
            for (int j = 0; j < s.length; j++) {
                alphabet[s[j] - 'A'] = true;
            }

            int sum = 0;
            for (int j = 0; j < alphabet.length; j++) {
                if (!alphabet[j])
                    sum += j + 'A';
            }

            System.out.println(sum);
        }
    }
}
