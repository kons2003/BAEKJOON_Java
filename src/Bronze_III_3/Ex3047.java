// ABC
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int[] num = new int[3];

        // A < B, B < C
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        String abc = st.nextToken();
        Arrays.sort(num);

        for (int j = 0; j < num.length; j++) {
            if ('A' == abc.charAt(j)) {
                System.out.print(num[0] + " ");
            } else if ('B' == abc.charAt(j)) {
                System.out.print(num[1] + " ");
            } else if ('C' == abc.charAt(j)) {
                System.out.print(num[2] + " ");
            }
        }
    }
}
