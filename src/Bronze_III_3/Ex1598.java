// 꼬리를 무는 숫자 나열
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int aWidth = (a - 1) / 4 + 1;
        int bWidth = (b - 1) / 4 + 1;
        int aLength = (a - 1) % 4 + 1;
        int bLength = (b - 1) % 4 + 1;

        int width = Math.abs(aWidth - bWidth);
        int length = Math.abs(aLength - bLength);

        System.out.println(width + length);
    }
}
