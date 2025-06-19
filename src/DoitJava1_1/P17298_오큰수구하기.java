package DoitJava1_1;

import java.io.*;
import java.util.Stack;

// 3 5 2 7
// 5 7 7 -1
public class P17298_오큰수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        stack.push(0); //스택 초기화
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        int ans[] = new int[N];
        String str[] = br.readLine().split(" ");
        for(int i = 0;i<N;i++){
            A[i] = Integer.parseInt(str[i]);
        }
        for(int i = 0;i<N;i++){
            while(!stack.isEmpty() && A[i] > A[stack.peek()]){ //즉 3과 5를 비교
                ans[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            //반복문을 다 돌고 나왔는데 스택이 비어 있지 않다면 빌 때까지
            ans[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0;i<N;i++){
            bw.write(ans[i]  + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
