// 숫자 카드 2
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex10816 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        int key;
        int value;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            key = Integer.parseInt(st.nextToken());
            if (map.get(key) == null) {
                map.put(key, 1);
            } else {
                value = map.get(key);
                map.put(key, value + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {

            key = Integer.parseInt(st.nextToken());
            if (map.get(key) == null) {
                sb.append(0).append(" ");
            } else {
                value = map.get(key);
                sb.append(value).append(" ");
            }
        }

        System.out.print(sb);
    }
}
