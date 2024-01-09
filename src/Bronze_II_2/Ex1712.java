// 손익분기점
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken()); // 고정비용
        long b = Long.parseLong(st.nextToken()); // 가변비용
        long c = Long.parseLong(st.nextToken()); // 노트북 가격

        if (c - b <= 0) { // 손익분기점 존재 X
            System.out.println(-1);
        } else { // c - b > 0
            System.out.println(a / (c - b) + 1);
        }
    }
}
