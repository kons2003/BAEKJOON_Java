// CD
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Ex4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n;
        int m;
        int cnt;
        HashSet<Long> hashSet = new HashSet<>();

        while (true) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) { break; }

            for (int i = 0; i < n; i++) {
                hashSet.add(Long.parseLong(br.readLine()));
            }

            cnt = 0;
            for (int i = 0; i < m; i++) {
                if (hashSet.contains(Long.parseLong(br.readLine()))) {
                    cnt++;
                }
            }

            hashSet.clear();

            System.out.println(cnt);
        }
    }
}
