// 탁구 경기
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;

        int sign = 0;
         for(int i = 0; i < n; i++) {
             String str = br.readLine();

             if(str.equals("D")) {
                 x++;
             } else {
                 y++;
             }

             if (sign == 0) {
                 if (Math.abs(x - y) == 2) {
                     System.out.print(x + ":" + y);
                     System.out.println();
                     sign = 1;
                 }
             }
         }
         if(sign ==0) {
             System.out.print(x + ":" + y);
             System.out.println();
         }
    }
}
