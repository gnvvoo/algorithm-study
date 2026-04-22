package doit.problem003;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] numArr = new int[n + 1];
        int[] sumArr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
            sumArr[i] = sumArr[i - 1] + numArr[i];
        }

        int i, j, sum;
        for (int count = 0; count < m; count++) {
            st = new StringTokenizer(br.readLine());

            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            sum = sumArr[j] - sumArr[i - 1];
            bw.write(sum + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
