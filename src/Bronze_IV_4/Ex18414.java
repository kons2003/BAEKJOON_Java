// X に最も近い値 (The Nearest Value)
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex18414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int min = 100001;
        for (int i = l; i <= r; i++) {
            if (Math.abs(x - min) > Math.abs(x - i)) {
                min = i;
            }
        }

        System.out.println(min);
    }
}
