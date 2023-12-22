// 그대로 출력하기 2
package Bronze_III_3;

import java.io.*;

public class Ex11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while ((s = br.readLine()) != null) {
            bw.write(s);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
