// 모음의 개수
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10987 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] vowels = br.readLine().toCharArray();

        int cnt = 0;

        for (int i = 0; i < vowels.length; i++) {

            if (vowels[i] == 'a'
                    || vowels[i] == 'e'
                    || vowels[i] == 'i'
                    || vowels[i] == 'o'
                    || vowels[i] == 'u') {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
