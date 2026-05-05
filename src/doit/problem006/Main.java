package doit.problem006;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;
        int answer_cnt = 0;

        while (end_idx <= N) {
            if (sum < N) {
                sum += ++end_idx;
            } else if (sum == N) {
                answer_cnt++;
                sum -= start_idx++;
            } else if (sum > N) {
                sum -= start_idx++;
            }
        }

        bw.write(String.valueOf(answer_cnt));
        bw.flush();
        br.close();
        bw.close();
    }
}
