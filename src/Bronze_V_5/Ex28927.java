// Киноманы
package Bronze_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex28927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t1 = Integer.parseInt(st.nextToken()); // 맥스가 본 트레일러
        int e1 = Integer.parseInt(st.nextToken()); // 맥스가 본 TV 쇼
        int f1 = Integer.parseInt(st.nextToken()); // 맥스가 본 영화

        st = new StringTokenizer(br.readLine());
        int t2 = Integer.parseInt(st.nextToken()); // 멜이 본 트레일러
        int e2 = Integer.parseInt(st.nextToken()); // 멜이 본 TV 쇼
        int f2 = Integer.parseInt(st.nextToken()); // 멜이 본 영화

        /** 각 영상 진행 시간
         * 트레일러: 3분
         * TV 쇼: 20분
         * 영화: 2시간(120분)
         */

        // 맥스가 비디오 시청에 할애한 시간
        int max = t1*3 + e1*20 + f1*120;
        // 멜이 비디오 시청에 할애한 시간
        int mel = t2*3 + e2*20 + f2*120;

        // 맥스와 멜의 시청 시간 비교후, 출력하는 코드
        if (max > mel) {
            System.out.println("Max");
        } else if (max == mel) {
            System.out.println("Draw");
        } else if (max < mel) {
            System.out.println("Mel");
        }
    }
}
