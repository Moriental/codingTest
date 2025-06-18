package DoitJava1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); //문자열의 크기
        int P = Integer.parseInt(st.nextToken()); //부분 문자열의 크기
        int result = 0;
        char A[] = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for(int i = 0;i<4;i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0){
                checkSecret++;
            }
        }
        for(int i = 0; i<P;i++){
            Add(A[i]); //부분 문자열 처음 받았을 때 세팅
        }

        if(checkSecret == 4){
            result++;
        }
        //슬라이딩 윈도우
        //이 코드에서 i는 현재 부분 문자열이 적용된 곳 까지 즉 P까지
        //즉 [1,2,3,4],5,6,7,8 <- 1234까지 의 위치 그래서 i가 늘어나면은 2,3,4,5 ,3,4,5,6 이런식으로
        //반대로 j는 위 숫자에서 줄어든 1,2 가 됨
        for(int i = P; i<S;i++){
            // i=p니깐 만약 부분문자열로 2가 들어오게 되면 i=p니깐 2-2 즉 0번째 배열에 접근
            // 그러므로 i의 값은 계속 ++ 되니깐 3-2 = 1번째 인덱스에 접근 이런식으로 접근하게 된다.
            int j = i-P;
            Add(A[i]);
            remove(A[j]);
            if(checkSecret == 4){
                result++;
            }
        }
        System.out.println(result);
        br.close();
    }

    private static void Add(char c) {
        switch(c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]){
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    checkSecret++;
                }
                break;
        }
    }
    public static void remove(char c){
        switch(c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                myArr[3]--;
                break;
        }
    }

}
