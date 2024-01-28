// 회사에 있는 사람
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ex7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        String record;
        HashSet<String> hashSet = new HashSet<>();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            name = st.nextToken();
            record = st.nextToken();

            if (record.equals("enter")) {
                hashSet.add(name);
            } else { // record.equals("leave")
                hashSet.remove(name);
            }
        }

        // hashSet 내림차순 정렬 코드
        ArrayList<String> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList, Collections.reverseOrder());

        // StringBuilder로 첫 문자와 마지막 문자인 '[', ']' 제거
        StringBuilder sb = new StringBuilder();
        sb.append(arrayList);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);

        sb = new StringBuilder(sb.toString().replace(", ", "\n")); // ", " -> "\n" 으로 변경

        System.out.println(sb);
    }
}
