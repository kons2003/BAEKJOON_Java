// Contest Struggles
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex21339 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 총 문제 수
        int k = Integer.parseInt(st.nextToken()); // 로테팀이 해결한 문제 수

        st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken()); // 문제의 평균 난이도
        int s = Integer.parseInt(st.nextToken()); // 로테팀이 해결한 문제의 평균 난이도

        double allAvg = d * n;
        double solvedAvg = s * k;
        double unSolvedAvg = (allAvg - solvedAvg) / (n - k);

        if (unSolvedAvg < 0 || 100 < unSolvedAvg) {
            System.out.println("impossible");
        } else {
            System.out.printf("%.7f\n", unSolvedAvg);
        }
    }
}
