// 뚜기뚜기메뚜기
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex10545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> arr = new ArrayList<>(10); // 바뀐 자판 저장
        arr.add(0); // 안 쓰는 초기값

        // 예제 입력
        for (int i = 1; i <= 9; i++) {
            arr.add(i, Integer.parseInt(st.nextToken())); // 바뀐 키대로 입력
        }
        char[] s = br.readLine().toCharArray(); // 문자열 입력

        // 눌러야 하는 키 계산
        int prev = 0; // 이전 번호
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'a' || s[i] == 'b' || s[i] == 'c') {
                if (prev == 2) { // 이전에도 이 키를 썼으면 #추가
                    sb.append("#");
                }
                for (int j = 0; j <= Math.abs(s[i] - 'a'); j++) {
                    sb.append(arr.indexOf(2));
                }
                prev = 2;
            } else if (s[i] == 'd' || s[i] == 'e' || s[i] == 'f') {
                if (prev == 3) {
                    sb.append("#");
                }
                for (int j = 0; j <= Math.abs(s[i] - 'd'); j++) {
                    sb.append(arr.indexOf(3));
                }
                prev = 3;
            } else if (s[i] == 'g' || s[i] == 'h' || s[i] == 'i') {
                if (prev == 4) {
                    sb.append("#");
                }
                for (int j = 0; j <= Math.abs(s[i] - 'g'); j++) {
                    sb.append(arr.indexOf(4));
                }
                prev = 4;
            } else if (s[i] == 'j' || s[i] == 'k' || s[i] == 'l') {
                if (prev == 5) {
                    sb.append("#");
                }
                for (int j = 0; j <= Math.abs(s[i] - 'j'); j++) {
                    sb.append(arr.indexOf(5));
                }
                prev = 5;
            } else if (s[i] == 'm' || s[i] == 'n' || s[i] == 'o') {
                if (prev == 6) {
                    sb.append("#");
                }
                for (int j = 0; j <= Math.abs(s[i] - 'm'); j++) {
                    sb.append(arr.indexOf(6));
                }
                prev = 6;
            } else if (s[i] == 'p' || s[i] == 'q' || s[i] == 'r' || s[i] == 's') {
                if (prev == 7) {
                    sb.append("#");
                }
                for (int j = 0; j <= Math.abs(s[i] - 'p'); j++) {
                    sb.append(arr.indexOf(7));
                }
                prev = 7;
            } else if (s[i] == 't' || s[i] == 'u' || s[i] == 'v') {
                if (prev == 8) {
                    sb.append("#");
                }
                for (int j = 0; j <= Math.abs(s[i] - 't'); j++) {
                    sb.append(arr.indexOf(8));
                }
                prev = 8;
            } else if (s[i] == 'w' || s[i] == 'x' || s[i] == 'y' || s[i] == 'z') {
                if (prev == 9) {
                    sb.append("#");
                }
                for (int j = 0; j <= Math.abs(s[i] - 'w'); j++) {
                    sb.append(arr.indexOf(9));
                }
                prev = 9;
            }
        }

        System.out.println(sb);
    }
}
