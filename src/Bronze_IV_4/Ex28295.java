// 체육은 코딩과목 입니다
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex28295 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int direction = 0;

        for (int i=0; i<10; i++) {
            int t = Integer.parseInt(bf.readLine());

            if (t == 1) // 우향우
                direction += 90;
            else if (t == 2) // 뒤로 돌아
                direction += 180;
            else if (t == 3)  //좌향좌
                direction += 270;
        }

        direction %= 360;
        if (direction == 0) // direction == 360
            System.out.println("N");
        else if (direction == 90)
            System.out.println("E");
        else if (direction == 180)
            System.out.println("S");
        else if (direction == 270)
            System.out.println("W");
    }
}
