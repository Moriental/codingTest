package DoitJava2_2;

import java.util.*;

public class P2750_수정렬하기1 { //버블정렬
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<N-1;i++){
            for(int j = 0;j<N-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
