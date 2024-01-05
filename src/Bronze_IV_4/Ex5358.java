// Football Team
package Bronze_IV_4;

import java.io.*;

public class Ex5358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        StringBuilder sb = new StringBuilder();
        while ((s = br.readLine()) != null && !s.isEmpty()) {

            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'e') {
                    sb.append('i');
                } else if (arr[i] == 'i') {
                    sb.append('e');
                } else if (arr[i] == 'E') {
                    sb.append('I');
                } else if (arr[i] == 'I') {
                    sb.append('E');
                } else {
                    sb.append(arr[i]);
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
