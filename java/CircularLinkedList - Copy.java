class Node {
    int value;
    Node nextNode;

    public Node(int value) {
        this.value = value;
    }
}

public class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

    public void addNode(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }

        tail = newNode;
        tail.nextNode = head;
    }

    public boolean containsNode(int searchValue) {
        Node currentNode = head;

        if (head == null) {
            return false;
        } else {
            do {
                if (currentNode.value == searchValue) {
                    return true;
                }
                currentNode = currentNode.nextNode;
            } while (currentNode != head);
            return false;
        }
    }

    public void deleteNode(int valueToDelete) {
        Node currentNode = head;
        if (head == null) {
            return;
        }
        do {
            Node nextNode = currentNode.nextNode;
            if (nextNode.value == valueToDelete) {
                if (tail == head) {
                    head = null;
                    tail = null;
                } else {
                    currentNode.nextNode = nextNode.nextNode;
                    if (head == nextNode) {
                        head = head.nextNode;
                    }
                    if (tail == nextNode) {
                        tail = currentNode;
                    }
                }
                break;
            }
            currentNode = nextNode;
        } while (currentNode != head);
    }

    public void traverse() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(currentNode.value);
            currentNode = currentNode.nextNode;
            if (currentNode != head) {
                System.out.print(" -> ");
            }
        } while (currentNode != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addNode(13);
        cll.addNode(7);
        cll.addNode(24);
        cll.addNode(1);
        cll.addNode(8);
        cll.addNode(37);
        cll.addNode(46);

        cll.traverse();

        System.out.println("Contains 24: " + cll.containsNode(24));
        System.out.println("Contains 99: " + cll.containsNode(99));

        cll.deleteNode(1);
        cll.deleteNode(13);
        cll.deleteNode(46);

        cll.traverse();
    }
}