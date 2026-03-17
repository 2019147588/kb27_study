import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();      // 소문자 문자열

        int[] arr = new int[26];          // a ~ z 개수 저장

        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// 문자열을 차례대로 받아 토큰화 한다.
// 토큰화 한 문자열을 아스키 코드로 변환하여 해당하는 인덱스의 값을 1씩 증가시킨다.
// 증가시킨 값을 출력한다.