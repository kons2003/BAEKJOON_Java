// 명령 프롬프트
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] file = new String[51];
        char[] name1, name2;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            file[i] = br.readLine();
        }

        name1 = file[0].toCharArray();
        
        for (int i = 1; i < n; i++) {
            name2 = file[i].toCharArray();

            for (int j = 0; j < name1.length; j++) {
                if (name1[j] != name2[j])
                    name1[j] = '?';
            }
        }

        System.out.println(name1);
    }
}
