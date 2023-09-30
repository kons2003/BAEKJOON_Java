// 별 찍기 - 13
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=(2*n-1); i++) {
            if (i <= n) {
                for (int j=1; j<=i; j++)
                    System.out.print("*");
                System.out.println();
            } else if (i > n) {
                for (int j=i; j<=(2*n-1); j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
