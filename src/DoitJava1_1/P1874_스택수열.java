package DoitJava1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1874_스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        for(int i = 0;i<N;i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        int num = 1;
        boolean result = true;
        StringBuffer bf = new StringBuffer();
        for(int i = 0;i<A.length;i++){
            int temp = A[i];
            if(temp >= num){
                while(temp >= num){
                    st.push(num++);
                    bf.append("+\n");
                }
                st.pop();
                bf.append("-\n");
            }
            else{
                int n = st.pop();
                if(n > temp){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else{
                    bf.append("-\n");
                }
            }
        }
        if(result == true){
            System.out.println(bf.toString());
        }
    }
}
