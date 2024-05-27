// H4x0r
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex26768 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        s = s.replace("a", "4").replace("e", "3").replace("i", "1").replace("o", "0").replace("s", "5");

        System.out.println(s);
    }
}
