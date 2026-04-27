package doit.problem005;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N = 수의 개수, M = 나누는 값
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        /*
         * 누적합 배열
         * sum[i] = 1번 ~ i번까지 합
         *
         * sum[0] = 0 을 반드시 포함
         * -> 시작점이 1번인 구간도 일반 구간처럼 처리 가능
         */
        long[] sum = new long[n + 1];

        st = new StringTokenizer(br.readLine());

        // 누적합 계산
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum[i] = sum[i - 1] + num;
        }

        /*
         * 누적합을 M으로 나눈 나머지로 변환
         *
         * 핵심 공식:
         * (sum[j] - sum[i]) % M == 0
         * 이려면
         * sum[j] % M == sum[i] % M
         *
         * 즉 같은 나머지를 가진 두 누적합을 고르면
         * 그 사이 구간합은 M의 배수
         */
        for (int i = 1; i <= n; i++) {
            sum[i] %= m;
        }

        /*
         * modCnt[r] = 나머지가 r인 누적합 개수
         */
        long[] modCnt = new long[m];

        // 각 나머지 개수 세기
        for (long mod : sum) {
            modCnt[(int) mod]++;
        }

        long answer = 0;

        /*
         * 같은 나머지 개수가 k개라면
         * 그 중 2개를 고르는 경우의 수 = kC2
         *
         * k * (k - 1) / 2
         *
         * cnt가 0,1이어도 자동으로 0 처리되므로
         * if문 필요 없음
         */
        for (int i = 0; i < m; i++) {
            answer += modCnt[i] * (modCnt[i] - 1) / 2;
        }

        bw.write(String.valueOf(answer));
        bw.flush();

        br.close();
        bw.close();
    }
}