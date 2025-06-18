package DoitJava1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽의명령 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);// 정렬해주는 메소드

        int count = 0;
        int i =0;
        int j =N-1; // 배열 상에서 1,2,3,4,5,6 이 있다고 할 때 배열의 마지막 크기는 (5) 그래서 n-1

        while(i<j){
            if(A[i] + A[j] < M){
                i++;
            }
            else if(A[i] + A[j] > M){
                j--;
            }
            else{
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        br.close();
    }
}
