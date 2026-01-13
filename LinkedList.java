public class LinkedList {
    public static void main(String[] args) {
        Node linkedList = new Node(3);
        linkedList.next = new Node(12);
        linkedList.next.next = new Node(45);
        linkedList.next.next.next = new Node(486);
        System.out.println(CountNodes(linkedList));
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
