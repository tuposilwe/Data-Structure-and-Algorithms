package Data_Structure;
import java.util.LinkedList;

public class LinkedListStructure {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//linkedList.pop();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

//        linkedList.poll();
        linkedList.add(4,"E");
//        linkedList.remove("E");

        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList);
    }
}
