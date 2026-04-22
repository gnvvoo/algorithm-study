package doit.problem001;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String numArr = br.readLine();
        char[] cNum = numArr.toCharArray();

        int sum = 0;
        for (char c : cNum) {
            sum += c -'0';
        }

        bw.write(sum + "\n");
        bw.flush();
        br.close();
        bw.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String num = sc.next();
//        char[] arr = num.toCharArray();
//
//        int sum = 0;
//        for(char cNum : arr) {
//            sum += cNum - '0';
//        }
//
//        System.out.println(sum);
    }
}
