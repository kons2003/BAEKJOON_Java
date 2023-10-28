// 뒤집힌 덧셈
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(st.nextToken());

        String x = sb.reverse().toString();

        sb = new StringBuilder(st.nextToken());
        String  y = sb.reverse().toString();

        int sum = Integer.parseInt(x) + Integer.parseInt(y);

        sb = new StringBuilder(String.valueOf(sum));

        String result = sb.reverse().toString();

        System.out.println(Integer.parseInt(result));
    }
}