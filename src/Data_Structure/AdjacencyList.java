package Data_Structure;

public class AdjacencyList {
    public static void main(String[] args) {
        //Adjacency List = An array/arrayList of linkedlists.
        //                 Each LinkedList has a unique node at the head.
        //                  All adjacent neighbors to that node are added to that node's linkedlist.

        //                  runtime complexity to check an Edge: O(v)
        //                  space complexity: O(v + e)


        Graph2 graph2 = new Graph2();

        graph2.addNode(new Node('A'));
        graph2.addNode(new Node('B'));
        graph2.addNode(new Node('C'));
        graph2.addNode(new Node('D'));
        graph2.addNode(new Node('E'));

        graph2.addEdge(0,1);
        graph2.addEdge(1,2);
        graph2.addEdge(1,4);
        graph2.addEdge(2,3);
        graph2.addEdge(2,4);
        graph2.addEdge(4,0);
        graph2.addEdge(4,2);

        graph2.print();

    }
}



















