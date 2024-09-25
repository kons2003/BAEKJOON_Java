// 최고의 피자
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex5545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 토핑의 종류의 수

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 도우의 가격
        int b = Integer.parseInt(st.nextToken()); // 토핑의 가격
        int c = Integer.parseInt(br.readLine()); // 도우의 열량

        Integer[] calories = new Integer[n]; // 토핑의 열량 저장 배열

        for (int i = 0; i < n; i++) {
            calories[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(calories, Collections.reverseOrder());

        int pizzaPrice = a;
        int pizzaCalorie = c;
        int bestPizza = pizzaCalorie / pizzaPrice;

        for (int i = 0; i < n; i++) {
            int k = i + 1;
            pizzaPrice = a + b * k;
            pizzaCalorie += calories[i];
            int currentPizza = pizzaCalorie / pizzaPrice;

            if (bestPizza <= currentPizza) {
                bestPizza = currentPizza;
            } else {
                break;
            }
        }

        System.out.println(bestPizza);
    }
}
