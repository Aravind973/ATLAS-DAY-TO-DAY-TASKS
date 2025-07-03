public class CustomNode<T> {
    private T data;
    private CustomNode<T> next;
    
    public CustomNode(T data) {
        this.data = data;
        this.next = null;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public CustomNode<T> getNext() {
        return next;
    }
    
    public void setNext(CustomNode<T> next) {
        this.next = next;
    }
    
    public void addAfter(T newData) {
        CustomNode<T> newNode = new CustomNode<>(newData);
        newNode.setNext(this.next);
        this.next = newNode;
    }
    
    public void traverse() {
        CustomNode<T> current = this;
        System.out.println("Traversing nodes:");
        
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNext() != null) {
                System.out.print(" -> ");
            }
            current = current.getNext();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        CustomNode<String> head = new CustomNode<>("First");
        head.addAfter("Second");
        head.getNext().addAfter("Third");
        head.getNext().getNext().addAfter("Fourth");
        head.getNext().getNext().getNext().addAfter("Fifth");
        head.traverse();
        
        CustomNode<Integer> numberHead = new CustomNode<>(10);
        numberHead.addAfter(20);
        numberHead.getNext().addAfter(30);
        numberHead.traverse();
    }
}