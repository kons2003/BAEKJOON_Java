// 가지 교배
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex27939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 품종 수

        String[] colors = new String[n+1]; // 품종의 색 저장 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            colors[i] = st.nextToken();
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); // 조수의 수
        int k = Integer.parseInt(st.nextToken()); // 조수가 가진 품종의 수

        boolean wAble = false; // w 가능 여부

        for (int i = 0; i < m; i++) {
            int wCount = 0; // 흰색 품종 개수

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                if (colors[Integer.parseInt(st.nextToken())].equals("W")) {
                    wCount++; // w품종 카운트
                }
            }

            if (wCount == k) {
                wAble = true;
            }
        }

        if (wAble) {
            System.out.println("W");
        } else {
            System.out.println("P");
        }
    }
}
