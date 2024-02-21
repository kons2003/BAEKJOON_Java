// 비밀번호 찾기
package Silver_IV_4;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> hashMap = new HashMap<>();
        String address, pwd;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            address = st.nextToken();
            pwd = st.nextToken();
            hashMap.put(address, pwd);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < m; i++) {
            address = br.readLine();
            bw.write(hashMap.get(address));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
