package DoitJava1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long [] s = new long[suNo + 1]; //배열에 +1을 하는 이유는 인덱싱을 1부터 하기 위해
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        //0부터 시작
        for(int i = 1; i<=suNo;i++){
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q= 0;q<quizNo;q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j] - s[i-1]);
        }
    }
}
