// 나이순 정렬
package Silver_V_5;

import java.io.*;
import java.util.StringTokenizer;

public class Ex10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder[] sb = new StringBuilder[201];

        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            sb[age].append(age).append(" ").append(name).append("\n");
        }

        StringBuilder p = new StringBuilder();
        for (StringBuilder val : sb) {
            p.append(val);
        }

        bw.write(String.valueOf(p));

        bw.flush();
        bw.close();
    }
}
