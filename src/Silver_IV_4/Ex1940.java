// 주몽
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        ArrayList<Integer> num = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(st.nextToken()));
        }

        int point = 0; // 현재 기준 인덱스 위치
        int count = 0; // 갑옷 개수
        while (point < num.size()) {
            int current = num.get(point);
            int secondNum = m - current;

            if (secondNum > 0 && secondNum != current && num.contains(secondNum)) {
                count++;
                num.remove(num.indexOf(secondNum));
                num.remove(num.indexOf(current));

            } else {
                point++;
            }
        }

        System.out.println(count);
    }
}
