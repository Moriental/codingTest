package DoitJava2_2;

import java.util.Scanner;

public class P1247_내림차순정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int A[] = new int[N.length()];
        for(int i =0;i<N.length();i++){
            A[i]=Integer.parseInt(N.substring(i,i+1));
        }
        for(int i =0;i<N.length();i++){
            int max = i;
            for(int j =i+1;j<N.length();j++){
                if(A[j] > A[max]){
                    max = j;
                }
            }
            if(A[i]<A[max]){
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }
        for(int i =0;i<N.length();i++){
            System.out.print(A[i]);
        }
    }
}
