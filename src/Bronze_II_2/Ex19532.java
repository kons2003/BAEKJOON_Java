// 수학은 비대면강의입니다
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 방정식1
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 방정식2
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        // x 구하기
        int ae = a * e;
        int ce = c * e;
        int db = d * b;
        int fb = f * b;

        int x = (ce - fb) / (ae - db);

        // y 구하기
        int bd = b * d;
        int cd = c * d;
        int ea = e * a;
        int fa = f * a;

        int y = (cd - fa) / (bd - ea);

        // x, y 출력
        System.out.printf("%d %d", x, y);
    }
}
