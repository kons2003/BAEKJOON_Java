// 가격
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex11296 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 점 색깔 별 할인율
        Map<String, Integer> dots = new HashMap<>();
        dots.put("R", 45);
        dots.put("G", 30);
        dots.put("B", 20);
        dots.put("Y", 15);
        dots.put("O", 10);
        dots.put("W", 5);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double originalPrice = Double.parseDouble(st.nextToken());
            String color = st.nextToken();
            String coupon = st.nextToken();
            String payment = st.nextToken();

            double currentPrice = originalPrice;

            // 점 스티커 할인
            currentPrice -= (currentPrice * dots.get(color) / 100);
            currentPrice = Math.round(currentPrice * 100) / 100.0; // 셋째 자리에서 반올림

            // 쿠폰 할인
            currentPrice -= coupon.equals("C") ? currentPrice * 5 / 100 : 0; // 쿠폰 있으면 5% 할인, 없으면 할인X
            currentPrice = Math.round(currentPrice * 100) / 100.0; // 셋째 자리에서 반올림

            // 현글 결제일 때
            if (payment.equals("C")) {
                int secondDecimal = (int) (currentPrice * 100 % 10); // 소수 둘째 자리

                if (secondDecimal >= 6) { // 소수 둘째 자리가 6이상일 떄
                    currentPrice = Math.round(currentPrice); // 둘째 자리에서 반올림
                } else {
                    currentPrice = (currentPrice * 100 - secondDecimal) / 100.0; // 소수 둘째 자리 0으로 만듦
                }
            }

            System.out.printf("$%.2f\n", currentPrice);
        }
    }
}
