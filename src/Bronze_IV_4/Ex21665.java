// Миша и негатив
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex21665 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[101][101];
        for (int i = 0; i < n; i++) {
                arr[i] = br.readLine().toCharArray();
        }
        br.readLine();

        char[][] arr2 = new char[101][101];
        for (int i = 0; i < n; i++) {
                arr2[i] = br.readLine().toCharArray();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == arr2[i][j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
