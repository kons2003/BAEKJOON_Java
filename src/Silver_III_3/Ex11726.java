// 2×n 타일링
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] tile = new int[1001];
        tile[1] = 1;
        tile[2] = 2;

        for (int i = 3; i < tile.length; i++) {
            tile[i] = (tile[i-2] + tile[i-1]) % 10007;
        }

        System.out.println(tile[n]);
    }
}
