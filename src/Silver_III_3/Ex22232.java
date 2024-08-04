// 가희와 파일 탐색기
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ex22232 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 파일 개수
        int m = Integer.parseInt(st.nextToken()); // 가희의 OS에서 인식하는 파일 확장자의 개수

        String[][] arr = new String[n][];
        // FILENAME.EXTENSION 형식의 문자열 주어짐
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().split("\\.");
        }

        HashSet<String> extensionList = new HashSet<>();
        // 가희가 설치한 OS에서 인식하는 파일 확장자
        for (int i = 0; i < m; i++) {
            extensionList.add(br.readLine());
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0].equals(o2[0])) { // 파일명이 같을 떼
                    if (extensionList.contains(o1[1]) && !extensionList.contains(o2[1])) { // o1만 인식하는 확장자
                        return -1;
                    } else if (!extensionList.contains(o1[1]) && extensionList.contains(o2[1])) { // o2만 인식하는 확장자
                        return 1;
                    } else { // 확장자 명 사전 순으로
                        return o1[1].compareTo(o2[1]);
                    }
                } else { // 파일명 사전순으로
                    return o1[0].compareTo(o2[0]);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(".").append(arr[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}
