// Everyone is a winner
package Bronze_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex31450 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); // 메달의 수
        int k = Integer.parseInt(st.nextToken()); // 아이들의 수

        if (m % k == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
