// 직각삼각형
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex4153 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);


        while(true) {

            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            // 0 0 0 을 입력받으면 종료
            if(x == 0 && y == 0 && z == 0) break;


            if((x * x + y * y) == z * z) {
                System.out.println("right");
            }
            else if(x * x == (y * y + z * z)) {
                System.out.println("right");
            }
            else if(y * y == (z * z + x * x)) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }

        }
    }
}
