// 너의 평점은
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String object;
        double score;
        String grade;
        double sum = 0;
        double gradeSum = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            object = st.nextToken();
            score = Double.parseDouble(st.nextToken());
            grade = st.nextToken();

            sum += score;

            switch (grade) {
                case "A+": gradeSum += score * 4.5; break;
                case "A0": gradeSum += score * 4.0; break;
                case "B+": gradeSum += score * 3.5; break;
                case "B0": gradeSum += score * 3.0; break;
                case "C+": gradeSum += score * 2.5; break;
                case "C0": gradeSum += score * 2.0; break;
                case "D+": gradeSum += score * 1.5; break;
                case "D0": gradeSum += score * 1.0; break;
                case "F": gradeSum += score * 0.0; break;
                case "P": sum -= score; break;
            }
        }

        System.out.printf("%.6f\n", gradeSum / sum);
    }
}
