// Arno's Sleep Schedule
package Bronze_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex29863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sleep = Integer.parseInt(br.readLine());
        int wake = Integer.parseInt(br.readLine());

        if (20 <= sleep && sleep <= 23) {
            System.out.println(24 - sleep + wake);
        } else if (0 <= sleep && sleep <= 3) {
            System.out.println(wake - sleep);
        }
    }
}
