// CurrentTimeMillis
import java.io.IOException;

public class CurrentTimeMillis {
    public static void main(String[] args) throws IOException {
        long beforeTime = System.nanoTime(); //코드 실행 전에 시간 받아오기

        //실험할 코드 추가

        //----------------------------

        long afterTime = System.nanoTime(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000000; //두 시간의 차 계산 ns, ms는 1000000 나눔
        System.out.println("수행시간(ms) : "+secDiffTime);
    }
}
