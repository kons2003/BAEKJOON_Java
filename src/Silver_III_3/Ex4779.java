// 칸토어 집합
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4779 {
    public static void main(String[] args) throws IOException {

        // 칸토어 집합 계산 코드
        String[] cantorSet = new String[13];
        cantorSet[0] = "-";

        for (int i = 1; i <= 12; i++) {
            cantorSet[i] = cantorSet[i - 1]
                    + String.format("%" + Math.pow(3, i - 1) + "s", " ")
                    + cantorSet[i - 1];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        // 입력 없을 떄까지 반복
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int n = Integer.parseInt(input);

            System.out.println(cantorSet[n]);
        }
    }
}
