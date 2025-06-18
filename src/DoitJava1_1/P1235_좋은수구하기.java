package DoitJava1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1235_좋은수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        for(int k = 0; k<N; k++){ //k를 10번씩 돈다. (만약 10개의 데이터가 입력된다면)
            int i = 0;
            int j = N - 1;
            int find = A[k];
            while(i<j){  //그래서 k를 찾기 위해 i와 j를 이동 그러나 1과 2는 더해서 구할 수 없는 값이기 때문에 찾을 수 없음
                if(A[i]+A[j] == find){ //최초 3을 찾게 되면 즉 i는 start_index (1) j는 end_index(10에서 2까지 계속 마이너스)
                    if(i != k && j !=k){ //그럼 3을 찾게됨
                        count++;
                        break;
                    }
                    else if(i==k){
                        i++;
                    }
                    else{
                        j--;
                    }
                }
                else if(A[i]+A[j] < find){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        System.out.println(count);

    }
}
