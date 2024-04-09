// Дневник Гравити Фолз
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex28940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int x = w / a;
        int y = h / b;

        if (a > w || b > h) {
            System.out.println(-1);
        } else {
            System.out.printf("%.0f\n", Math.ceil((double) n / (x * y)));
        }
    }
}
