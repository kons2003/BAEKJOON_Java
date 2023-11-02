// 반올림
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int digit = 10; // 반올림 기준이 될 변수
        int n = Integer.parseInt(br.readLine());

        // 반올림 하는 코드
        while (n > digit) { // digit가 최고 자리수까지 오면 종료
            if (n % digit >= digit / 2) { // 반올림 될 경우
                n -= n%digit; // 해당 자리수 0으로 저장
                n += digit; // 해당 자리수 반올림
            } else if (n % digit < digit / 2) { // 반올림 안될 경우
                n -= n%digit; // 해당 자리수 0으로 저장
            }
            
            digit *= 10; // 반올림 할 자리수 증가
        }

        System.out.println(n);
    }
}
