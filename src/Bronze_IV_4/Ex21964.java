// 선린인터넷고등학교 교가
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();

        for (int i = n-5; i < n; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
    }
}
