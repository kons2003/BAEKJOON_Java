// 이름 궁합
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex15312 {
    public static void main(String[] args) throws IOException {

        int[] alphabet = { 3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] jongMin = br.readLine().toCharArray();
        char[] her = br.readLine().toCharArray();
        int[] num = new int[jongMin.length + her.length];

        for (int i = 0; i < num.length - 1; i = i + 2) {
            num[i] = alphabet[jongMin[i/2] - 'A'];
            num[i+1] = alphabet[her[i/2] - 'A'];
        }

        int size = num.length;
        while (size > 2) {
            for (int i = 0; i < size-1; i++) {
                num[i] = (num[i] + num[i+1]) % 10;
            }
            num[--size] = 0;
        }

        System.out.println(String.valueOf(num[0]) + String.valueOf(num[1]));
    }
}
