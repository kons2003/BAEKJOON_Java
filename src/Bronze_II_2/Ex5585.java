// 거스름돈
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5585 {
    public static void main(String[] args) throws IOException {
        int[] coins = {500, 100, 50, 10, 5, 1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = 1000 - Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < coins.length; i++) {
            count += money / coins[i];
            money %= coins[i];
        }

        System.out.println(count);
    }
}

/*
public class Ex5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = 1000 - Integer.parseInt(br.readLine());
        int count = 0;

        if (money / 500 > 0) {
            count += money / 500;
            money %= 500;
        }
        if (money / 100 > 0) {
            count += money / 100;
            money %= 100;
        }
        if (money / 50 > 0) {
            count += money / 50;
            money %= 50;
        }
        if (money / 10 > 0) {
            count += money / 10;
            money %= 10;
        }
        if (money / 5 > 0) {
            count += money / 5;
            money %= 5;
        }
        count += money;

        System.out.println(count);
    }
}
*/
