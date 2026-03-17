import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9];
        int sum = 0;

        // 9줄에서 각각 키를 하나씩 입력받음
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int fake1 = -1;
        int fake2 = -1;

        // 제외할 두 난쟁이 찾기 (브루트포스)
        outer:
        for (int j = 0; j < 9; j++) {
            for (int k = j + 1; k < 9; k++) {
                if (sum - arr[j] - arr[k] == 100) {
                    fake1 = j;
                    fake2 = k;
                    break outer;
                }
            }
        }

        // 진짜 난쟁이 7명의 키만 모아서 정렬
        int[] real = new int[7];
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            if (i == fake1 || i == fake2) continue;
            real[idx++] = arr[i];
        }

        Arrays.sort(real);

        for (int h : real) {
            sb.append(h).append("\n");
        }

        System.out.println(sb);
    }
}
// 전체 난쟁이의 키 합계를 구한후 순서대로 2명의 난쟁이의 키를 빼본후 해당하는 난쟁이의 키를 제외하고 나머지 난쟁이의 키를 출력한다.