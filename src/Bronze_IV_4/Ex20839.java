// Betygsättning
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * x개의 기준 A, y개의 기준 C, z개의 기준 E
 * A: 모든 A, C, E 기준 만족, score = 6
 * B: 모든 E, C 기준 만족, 절반 이상의 A 기준 만족, score = 5
 * C: 모든 C, E 기준 만족, score = 4
 * D: 모든 E 기준 만족, 절반 이상의 C 기준 만족, score = 3
 * E: 모든 E 기준 만족, score = 2
 */
public class Ex20839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] std = new int[3]; // 기준 수 저장할 공간
        int[] cp = new int[3]; // 학생이 만족한 기준 수 저장할 공간
        int x, y, z; // 각각 기준 A, C, E 저장할 공간
        int score = 0; // x, y, z 합 저장 공간

        // 기준 수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            std[i] = Integer.parseInt(st.nextToken());
        }

        // 학생이 만족한 기준 수 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            cp[i] = Integer.parseInt(st.nextToken());
        }

        // 기준 A
        if (cp[0] == std[0]) { // 모두 만족
            x = 2;
        } else if (cp[0] >= (std[0]+1)/2) { // 절반 이상 만족
            x = 1;
        } else { // 만족 못함
            x = 0;
        }

        // 기준 C
        if (cp[1] == std[1]) { // 모두 만족
            y = 2;
        } else if (cp[1] >= (std[1]+1)/2) { // 절반 이상 만족
            y = 1;
        } else { // 만족 못함
            y = 0;
        }

        // 기준 E
        if (cp[2] == std[2]) { // 모두 만족
            z = 2;
        } else if (cp[2] >= (std[2]+1)/2) { // 절반 이상 만족
            z = 1;
        } else { // 만족 못함
            z = 0;
        }

        /**
         * A = 6
         * B = 5
         * C = 4
         * D = 3
         * E = 2
         */
        score = x + y + z;

        if (score == 6) {
            System.out.println("A");
        } else if (score == 5) {
            System.out.println("B");
        } else if (score == 4) {
            System.out.println("C");
        } else if (score == 3) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
