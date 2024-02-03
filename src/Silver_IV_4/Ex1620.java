// 나는야 포켓몬 마스터 이다솜
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> pokemon = new HashMap<>();
        HashMap<String, Integer> reversePokemon = new HashMap<>();

        // pokemon 값 입력
        for (int i = 1; i <= n; i++) {
            pokemon.put(i, br.readLine());
        }

        // key 값을 찾기 위한 reversePokemon
        for (Map.Entry<Integer, String> entry : pokemon.entrySet()) {
            reversePokemon.put(entry.getValue(), entry.getKey());
        }

        for (int i = 0; i < m; i++) {

            String problem = br.readLine();
            char firstLetter = problem.charAt(0); // 첫 글자로 알파벳, 숫자 구분을 위한 변수

            // 알파벳인 경우
            if ('A' <= firstLetter && firstLetter <= 'Z'
                    || 'a' <= firstLetter && firstLetter <= 'z') { 
                System.out.println(reversePokemon.get(problem));
                
            // 숫자인 경우
            } else { 
                System.out.println(pokemon.get(Integer.parseInt(problem)));
            }
        }
    }
}
