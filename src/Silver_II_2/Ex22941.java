// RPG 마스터 오명진
package Silver_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex22941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int braverHP = Integer.parseInt(st.nextToken()); // 용사 HP
        int braverATK = Integer.parseInt(st.nextToken()); // 용사 ATK
        long demonLordHP = Long.parseLong(st.nextToken()); // 마왕 HP
        int demonLordATK = Integer.parseInt(st.nextToken()); // 마왕 ATK

        st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken()); // 마왕 스킬 발동 시점, 1~p
        int s = Integer.parseInt(st.nextToken()); // 마왕 회복량

        int braverRemainingHP = braverHP % demonLordATK; // 마왕이 마지막 공격 전 용사의 남은 피
        long demonLordRemainingHP = demonLordHP % braverATK; // 용사가 마지막 공격 전 마왕의 남은 피

        // 마왕이 스킬을 사용하는 경우
        if (demonLordHP > braverATK) {
            if (demonLordRemainingHP == 0) {
                if (p >= braverATK) {
                    demonLordHP += s;
                    demonLordRemainingHP = demonLordHP % braverATK;
                }
            } else if (demonLordRemainingHP <= p) {
                demonLordHP += s;
                demonLordRemainingHP = demonLordHP % braverATK;
            }
        }

        // 각각 공격 횟수 계산
        long numberOfBraverAttacks = demonLordHP / braverATK; // 용사의 공격 횟수
        if (demonLordRemainingHP > 0) {
            numberOfBraverAttacks++;
        }

        int numberOfDemonLordAttacks = braverHP / demonLordATK; // 마왕의 공격 횟수
        if (braverRemainingHP > 0) {
            numberOfDemonLordAttacks++;
        }

        // 결과 출력
        if (numberOfBraverAttacks <= numberOfDemonLordAttacks) { // 용사가 선공이므로 공격 횟수가 같아도 승리함
            System.out.println("Victory!");
        } else {
            System.out.println("gg");
        }
    }
}
