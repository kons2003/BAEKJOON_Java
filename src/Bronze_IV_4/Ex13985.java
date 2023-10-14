// Equality
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex13985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        String digit = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        String equal = st.nextToken();
        int c = Integer.parseInt(st.nextToken());

        if (a + b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
