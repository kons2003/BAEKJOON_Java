// 숫자 카드
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Ex10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashSet<Integer> nCard = new HashSet<>();

        int n = Integer.parseInt(br.readLine()); // 상근

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nCard.add(Integer.valueOf(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {

            if (nCard.contains(Integer.valueOf(st.nextToken()))) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        sb.deleteCharAt(sb.length() - 1); // 마지막 문자(" ") 제거

        System.out.println(sb);
    }
}
