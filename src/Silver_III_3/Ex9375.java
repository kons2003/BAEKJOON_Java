// 패션왕 신해빈
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Map<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); // 옷 이름
                String type = st.nextToken(); // 옷 종류

                if (!map.containsKey(type)) { // 해당 종류가 없었을 시
                    map.put(type, 0);
                }
                map.put(type, map.get(type) + 1);
            }

            int result = 1;

            for (int val : map.values()) {
                result *= (val + 1);
            }

            System.out.println(result - 1);
        }
    }
}
