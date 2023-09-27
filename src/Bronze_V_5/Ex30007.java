// 라면 공식
package Bronze_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex30007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = 0;
        int[] arr = new int[4];
        int n = Integer.parseInt(st.nextToken());

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) // Ai, Bi, Xi
                arr[j] = Integer.parseInt(st.nextToken());
            w = arr[0] * (arr[2] - 1) + arr[1];
            System.out.println(w);
        }

    }
}
