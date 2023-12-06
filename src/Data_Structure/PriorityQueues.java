package Data_Structure;

import java.util.*;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Double> queue =new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
