// 날짜 계산
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = {e, s, m};
        int[] arr2 = new int[3];
        int year = 0;

        while (true) {
            year++;

            if (arr2[0] == 15) { arr2[0] = 0; }
            arr2[0] += 1; // E
            if (arr2[1] == 28) { arr2[1] = 0; }
            arr2[1] += 1; // S
            if (arr2[2] == 19) { arr2[2] = 0; }
            arr2[2] += 1; // M

            if (arr[0] == arr2[0]
            && arr[1] == arr2[1]
            && arr[2] == arr2[2])
                break;
        }

        System.out.println(year);
    }
}
