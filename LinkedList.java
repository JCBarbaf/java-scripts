public class LinkedList {
    public static void main(String[] args) {
        Node node3 = new Node(45, null);
        Node node2 = new Node(12, node3);
        Node node1 = new Node(3, node2);
        System.out.println(CountNodes(node1));
    }
    public static int CountNodes(Node top) {
        if (top == null) {
            return 0;
        }
        int counter = 1;
        Node currentNode = top;
        while (currentNode.next != null) {
            counter++;
            currentNode = currentNode.next;
        }
        return counter;
    }
}
