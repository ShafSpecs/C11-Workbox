package list_collection;

public class LinkedList implements List {
    class Node {
        private String data;
        private Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public void removeNext() {
            return;
        }

        public String getData() {
            return data;
        }
    }

    private Node head;
    private int size;

    public LinkedList(){
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        Node currentNode;

        if(size == 0) {
            head = new Node(item);
        }

        for (int i = 0; i < size; i++) {
            currentNode = head;
        }
        size++;
    }

    @Override
    public boolean has(String item) {
        return false;
    }

    @Override
    public void remove(String s) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public int capacity() {
        return 0;
    }
}
