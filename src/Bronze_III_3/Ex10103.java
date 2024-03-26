// 주사위 게임
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int changSum = 100;
        int sangSum = 100;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int chang = Integer.parseInt(st.nextToken());
            int sang = Integer.parseInt(st.nextToken());

            if (chang > sang) {
                sangSum -= chang;
            } else if (chang < sang) {
                changSum -= sang;
            }
        }
        System.out.println(changSum);
        System.out.println(sangSum);
    }
}
