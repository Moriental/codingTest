package DoitJava1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11286_절대값힙구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->{

            // 절대값 작은 데이터 먼저
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            // 절대값이 같은 경우 음수 우선
            //첫 번째 있는 애가 두 번째 있는 애보다 더 크면 1을 리턴
            //아닐 경우 -1을 리턴
            if(first_abs == second_abs) return o1>o2 ? 1 :-1;
            //만약 양수 5와 -5가 들어오게 되면 5와 -5를 비교하는데 음수가 앞으로 정렬됨 5 -5에서 -5 5로 정렬
            return first_abs - second_abs; //? 이 부분이 제일 이해가 가지 않는다.
            //만약 첫 번째 절대값이 크고 두 번째 절대값이 작으면 양수가 리턴
            //즉 -5 3으로 정렬되어 있으면 -5와 3을 swap해서 3을 앞으로 보낸다.

        });
        for(int i = 0;i< N;i++){
            int request = Integer.parseInt(br.readLine());
            if(request == 0){
                if(pq.isEmpty()){
                    System.out.println("0");
                }
                else{
                    System.out.println(pq.poll());
                }
            }
            else{
                pq.add(request);
            }
        }
    }
}
