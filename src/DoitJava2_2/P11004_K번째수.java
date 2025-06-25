package DoitJava2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11004_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(A,0,N-1,K-1);
        System.out.println(A[K-1]);

    }
    public static void quickSort(int A[],int start,int end,int k){
        if(start<end){
            int myFivot = partition(A,start,end);
            if(myFivot == k){
                return;
            }
            else if(k<myFivot){
                quickSort(A,start,myFivot-1,k);
            }
            else{
                quickSort(A,myFivot+1,end,k);
            }
        }
    }
    public static int partition(int A[],int start,int end){
        if(start + 1 == end){
            if(A[start] > A[end]){
                swap(A,start,end);
            }
            return end;
        }
        int M = (start+end)/2;
        swap(A,start,M);
        int pivot = A[start];
        int i = start + 1,j=end;
        while(i<=j){
            //즉 j보다 피봇보다 작을 경우
            while(j>= start+1 && pivot < A[j]){ //피벗보다 작은 수가 나올 때 까지 j--;
                j--;
            }
            while(i<=end && pivot > A[i]){ // 피벗보다 큰 수가 나올 때 까지 i++
                i++;
            }
            if(i<=j){
                swap(A,i++,j--);
            }
        }
        A[start] = A[j];
        A[j] = pivot;
        return j;
    }
    public static void swap(int [] A, int start, int end){
        int temp = A[start];
        A[start] = A[end];
        A[end] = temp;
    }
}
