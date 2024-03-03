// 중간계 전쟁
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String  s = "";

        StringTokenizer st;
        for (int i = 1; i <= t; i++) {

            st = new StringTokenizer(br.readLine());
            int hobbit = Integer.parseInt(st.nextToken());
            int gandalfHuman = Integer.parseInt(st.nextToken()) * 2;
            int elf = Integer.parseInt(st.nextToken()) * 3;
            int dwarf = Integer.parseInt(st.nextToken()) * 3;
            int eagle = Integer.parseInt(st.nextToken()) * 4;
            int gandalfWizard = Integer.parseInt(st.nextToken()) * 10;

            st = new StringTokenizer(br.readLine());
            int oak = Integer.parseInt(st.nextToken());
            int sauronHuman = Integer.parseInt(st.nextToken()) * 2;
            int warg = Integer.parseInt(st.nextToken()) * 2;
            int goblin = Integer.parseInt(st.nextToken()) * 2;
            int urukHai = Integer.parseInt(st.nextToken()) * 3;
            int troll = Integer.parseInt(st.nextToken()) * 5;
            int sauronWizard = Integer.parseInt(st.nextToken()) * 10;

            int gandalfScore = hobbit + gandalfHuman + elf + dwarf + eagle + gandalfWizard;
            int sauronScore = oak + sauronHuman + warg + goblin + urukHai + troll + sauronWizard;

            if (gandalfScore > sauronScore) { // gandalf win
                s = "Good triumphs over Evil";
            } else if (gandalfScore == sauronScore) { // draw
                s = "No victor on this battle field";
            } else { // sauron win
                s = "Evil eradicates all trace of Good";
            }

            System.out.printf("Battle %d: %s\n", i, s);
        }
    }
}
