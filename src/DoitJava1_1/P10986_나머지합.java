package DoitJava1_1;

import java.util.Scanner;

public class P10986_나머지합 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int remainder = 0;
        long answer = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        long s[] = new long[N];
        long c[] = new long[N];

        s[0] = sc.nextInt();
        for(int i = 1;i<s.length;i++){
            s[i] = s[i-1]+sc.nextInt();
        }

        for(int i = 0;i<s.length;i++){
            remainder = (int) s[i]%M;
            if(remainder == 0){
                answer++;
            }
            c[remainder]++;
        }
        for(int i = 0;i<M; i++){
            if(c[i] > 1){
                answer = answer + c[i] * (c[i]-1)/2;
            }
        }
        System.out.print(answer);
    }
}
