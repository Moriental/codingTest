package DoitJava2_2;

import java.util.Scanner;

public class P11399_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int S[] = new int[N];
        //3 1 4 3 2
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0;i<N;i++){
            int insert_point = i; // 삽입 되어야 할 부분
            int insert_value = A[i]; // temp랑 비슷
            for(int j = i -1;j>=0;j--){ // j가 처음 시작할 때 -1이 되면 j>=0을 만족시키지 못하므로 바로 넘어감
                if(A[i]<A[j]){
                    insert_point = j+1; //정렬이 되어야 할 부분
                    break;
                }
                if(j==0){ // 정렬이 되어야 하는 부분이 없을 경우
                    insert_point = 0;
                }
            }
            for(int j = i;j>insert_point;j--){ //
                A[j] = A[j-1];
            }
            A[insert_point] = insert_value;
        }
        S[0] = A[0];
        for(int i = 1;i<N;i++){
            S[i] = S[i-1] +A[i]; //합배열
        }
        int sum = 0;
        for(int i = 0;i<N;i++){
            sum = sum+S[i];
        }
        System.out.println(sum);
    }
}
