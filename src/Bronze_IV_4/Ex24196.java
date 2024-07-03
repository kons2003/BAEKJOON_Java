// Gömda ord
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex24196 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] s = br.readLine().toCharArray();
        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            i += s[i] - 'A';
        }
    }
}
