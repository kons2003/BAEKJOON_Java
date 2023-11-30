// 소트인사이드
package Silver_V_5;

import java.io.*;
import java.util.Arrays;

public class Ex1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder st = new StringBuilder();

        String numberToString = br.readLine(); // = n

        Character[] stringToCharArray = new Character[numberToString.length()]; // Charater 배열로 저장
        // 배열 초기화
        for (int i = 0; i < numberToString.length(); i++) {
            stringToCharArray[i] = numberToString.charAt(i);
        }

        // 내림차순 정렬
        Arrays.sort(stringToCharArray, (o1, o2) -> {
            return o2 - o1; // 역순 정렬
        });

        // 문자열로 변환
        for (Character i : stringToCharArray) {
            st.append(i);
        }

        // 출력
        bw.write(String.valueOf(st));

        bw.flush();
        bw.close();
    }
}
