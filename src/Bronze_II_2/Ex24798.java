// The Weight Of Words
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex24798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        if (w < l || w > l * 26) {
            System.out.println("impossible");
        } else {
            char[] s = new char[l];
            Arrays.fill(s, 'a');

            int currentWeight = l;
            for (int i = 0; i < l; i++) {
                if (currentWeight == w) {
                    break;
                }
                int difference = Math.min(25, w - currentWeight);
                s[i] += difference;
                currentWeight += difference;
            }

            String result = new String(s);

            System.out.println(result);
        }
    }
}