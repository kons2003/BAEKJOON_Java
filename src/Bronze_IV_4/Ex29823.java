// Pakirobot Manhattanis
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex29823 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        int totalN = 0;
        int totalS = 0;
        int totalW = 0;
        int totalE = 0;
        int total = 0;

        for(int i = 0; i < b.length(); i++) {
            if(b.charAt(i) == 'N') {
                totalN++;
            }else if(b.charAt(i) == 'S') {
                totalS++;
            }else if(b.charAt(i) == 'W') {
                totalW++;
            }else if(b.charAt(i) == 'E') {
                totalE++;
            }
        }

        if(totalN > totalS) {
            total += totalN - totalS;
        }else {
            total += totalS - totalN;
        }

        if(totalW > totalE) {
            total += totalW - totalE;
        }else {
            total += totalE - totalW;
        }
        System.out.println(total);
    }
}
