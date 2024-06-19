// Poziome serca
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex26772 {
    public static void main(String[] args) throws IOException {
        String[] heart = {
                " @@@   @@@ ",
                "@   @ @   @",
                "@    @    @",
                "@         @",
                " @       @ ",
                "  @     @  ",
                "   @   @   ",
                "    @ @    ",
                "     @     "
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(heart[i]);
                if (j != n - 1) { sb.append(" "); }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
