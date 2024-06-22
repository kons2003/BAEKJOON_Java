// Affischutskicket
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex24183 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = 229 * 324 * Integer.parseInt(st.nextToken()) * 2;
        int b = 297 * 420 * Integer.parseInt(st.nextToken()) * 2;
        int c = 210 * 297 * Integer.parseInt(st.nextToken());

        System.out.println((a + b + c) * 0.000001);
    }
}
