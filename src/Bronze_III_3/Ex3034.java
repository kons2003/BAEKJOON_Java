// 앵그리 창영
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 성냥의 개수
        int w = Integer.parseInt(st.nextToken()); // 가로
        int h = Integer.parseInt(st.nextToken()); // 세로
        int diagonal = (int) Math.sqrt(w * w + h * h); // 대각선

        for (int i = 0; i < n; i++) {
            int match = Integer.parseInt(br.readLine());

            if (diagonal >= match) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
