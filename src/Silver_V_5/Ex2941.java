// 크로아티아 알파벳
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] words = (br.readLine() + "0").toCharArray();
        int cnt = 0;
        int i = 0;

        while (words[i] != '0'){
            switch (words[i]) {

                case 'c':
                    cnt++; i++;
                    if (words[i] == '=') i++;
                    else if (words[i] == '-') i++;
                    break;
                case 'd':
                    cnt++; i++;
                    if (words[i] == 'z') {
                        i++;
                        if (words[i] == '=') i++;
                        else cnt++;
                    } else if (words[i] == '-') i++;
                    break;
                case 'l':
                    cnt++; i++;
                    if (words[i] == 'j') i++;
                    break;
                case 'n':
                    cnt++; i++;
                    if (words[i] == 'j') i++;
                    break;
                case 's':
                    cnt++; i++;
                    if (words[i] == '=') i++;
                    break;
                case 'z':
                    cnt++; i++;
                    if (words[i] == '=') i++;
                    break;
                default: cnt++; i++;
            }
        }
        System.out.println(cnt);
    }
}
