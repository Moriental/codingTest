package DoitJava1_1;

import java.io.IOException;
import java.util.Scanner;

public class P2018_연속된자연수의합 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while(end_index !=N){
            if(sum == N){ // 만약 현재 sum값과 N이 맞다면 count (정답을 1 증가), end_index를 1 증가시켜서 현재의 sum값과 더함
                count++;
                end_index++;
                sum += end_index;
            }
            else if(sum > N){ // 만약 sum값이 현재 N보다 더 크다면 왼쪽의 N을 지움 (예를 들어 1+2+3+4+5 라면 1을 지운 2+3+4+5)
                sum -= start_index;
                start_index++;
            } 
            else{ //N이 sum보다 크다면 (만약 1,2,3,4,5,6 이 있다고 가정할 때 1+2+3+4+5만을 수행하고 있었으면 1+2+3+4+5+6을 수행)
                end_index++;
                sum+=end_index;
            }
        }
        System.out.println(count);
    }
}
