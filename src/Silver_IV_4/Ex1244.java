// 스위치 켜고 끄기
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfSwitches = Integer.parseInt(br.readLine()); // 스위치의 개수

        int[] switches = new int[numberOfSwitches];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberOfSwitches; i++) {
            switches[i] = Integer.parseInt(st.nextToken()); // 각 스위치 상태 줌
        }

        int numberOfStudents = Integer.parseInt(br.readLine()); // 학생 수

        // 학생 성별 및 받은 수 입력
        List<int[]> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            st = new StringTokenizer(br.readLine());

            students.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i)[0] == 1) { // 남학생인 경우
                maleStudent(switches, students.get(i)[1]);
            } else { // 여학생인 경우
                femaleStudent(switches, students.get(i)[1]);
            }
        }

        String result = Arrays.toString(switches).replace("[", "").replace(",", "").replace("]", "").trim();
        StringBuilder sb = new StringBuilder(result);

        int i = 1;
        while (sb.length() >= 40 * i) {
            sb.deleteCharAt(40 * i - 1);
            sb.insert(40 * i - 1, "\n");
            i++;
        }

        System.out.print(sb);
    }

    static void maleStudent (int[] switches, int num) {
        int i = 1;
        while (num * i - 1 < switches.length) {
            if (switches[num * i - 1] == 0) {
                switches[num * i - 1] = 1;
            } else {
                switches[num * i - 1] = 0;
            }
            i++;
        }
    }

    static void femaleStudent(int[] switches, int num) {
        int i = 1;
        int interval = 1; // 구간 길이
        while (0 <= num - i - 1 && num + i - 1 < switches.length) {
            if (switches[num - i - 1] == switches[num + i - 1]) {
                interval += 2;
            } else {
                break;
            }
            i++;
        }
        i--;

        if (interval == 1) { // 처음부터 대칭 아닐 때
            if (switches[num - 1] == 0) {
                switches[num - 1] = 1;
            } else {
                switches[num - 1] = 0;
            }
        } else {
            for (int j = num - i - 1; j <= num + i - 1; j++) {
                if (switches[j] == 0) {
                    switches[j] = 1;
                } else {
                    switches[j] = 0;
                }
            }
        }
    }
}
