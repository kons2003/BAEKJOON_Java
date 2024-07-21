// 배부른 마라토너
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex10546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 마라톤 참가자
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            if (map.get(name) == null) {
                map.put(name, 0);
            }
            map.put(name, map.get(name) + 1);
        }

        // 마라톤 완주자
        for (int i = 0; i < n-1; i++) {
            String name = br.readLine();

            map.put(name, map.get(name) - 1);
        }

        // 마라톤 완주 못한 사람 찾아서 출력
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (value == 1) {
                System.out.println(key);
            }
        }
    }
}
