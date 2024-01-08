// 기타줄
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] sixPrice = new int[m];
        int[] onePrice = new int[m];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            sixPrice[i] = Integer.parseInt(st.nextToken());
            onePrice[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sixPrice);
        Arrays.sort(onePrice);

        int onlySix = 0;
        int onlyOne = 0;
        int all = 0;
        int min = 0;

        // 패키지 상품만으로 결제시
        if (n % 6 == 0)
            onlySix = sixPrice[0] * (n / 6);
        else
            onlySix = sixPrice[0] * (n / 6 + 1);
        // 낱개 상품만으로 결제시
        onlyOne = onePrice[0] * n;
        // 패키지와 낱개 상품으로 결제시
        all = sixPrice[0] * (n / 6) + onePrice[0] * (n % 6);

        min = Math.min(onlySix, Math
                .min(onlyOne, all));

        System.out.println(min);
    }
}
