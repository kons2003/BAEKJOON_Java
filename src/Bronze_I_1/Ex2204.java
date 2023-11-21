// 도비의 난독증 테스트
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex2204 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String n = br.readLine();
            if(n.equals("0")){
                break;
            }
            List<String> wordList = new ArrayList<>();
            for(int i=0; i < Integer.parseInt(n); i++){
                wordList.add(br.readLine());
            }
            wordList.sort(String::compareToIgnoreCase);
            System.out.println(wordList.get(0));
        }
    }
}
