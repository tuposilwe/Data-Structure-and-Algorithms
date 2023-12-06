package Data_Structure;

import java.util.LinkedList;
import java.util.Queue;

public class QUes {
    public static void main(String[] args) {
        Queue<String>  queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

       // queue.poll();
        System.out.println(queue.contains("Karen"));

        System.out.println(queue.size());
    }
}
