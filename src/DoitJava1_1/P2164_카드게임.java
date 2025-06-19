package DoitJava1_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드게임 {
    public static void main(String[] args) {
        //1 2 3 4 -> 2 3 4 -> 3 4 2
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<= N;i++){
            q.add(i);
        }
        while(q.size() > 1){
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.poll());
    }
}
