package DoitJava2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1377_버블소트1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Mdata A[] = new Mdata[N];

        for(int i = 0;i<N;i++){
            A[i] = new Mdata(Integer.parseInt(br.readLine()),i);
        }
        //A[i]로 받았으므로 각 데이터가 1개씩만 클래스에 입력된다.
        Arrays.sort(A);
        int max = 0;
        for(int i = 0;i<N;i++){
            if(max < A[i].index - i){
                max = A[i].index - i;
            }
        }
        System.out.println(max+1);
    }

    static class Mdata implements Comparable<Mdata>{
        int value;
        int index;

        public Mdata(int value, int index){
            super();
            this.value = value;
            this.index = index;
        }
        @Override
        public int compareTo(Mdata o) {
            return this.value - o.value;
        }
    }
}
