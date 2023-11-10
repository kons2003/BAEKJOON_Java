// 네 번째 점
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] rect = new int[6];
        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = i*2; j <= i*2+1; j++) {
                rect[j] = Integer.parseInt(st.nextToken());
            }
        }


        if (rect[0] == rect[2]) {
            x = rect[4];
        } else if (rect[0] == rect[4]) {
            x = rect[2];
        } else {
            x = rect[0];
        }

        if (rect[1] == rect[3]) {
            y = rect[5];
        } else if (rect[1] == rect[5]) {
            y = rect[3];
        } else {
            y = rect[1];
        }

        System.out.printf("%d %d", x, y);
    }
}
