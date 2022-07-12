package list_collection;

public class Queue {
    private String[] storage;
    private int currentIndex;

    public Queue(int length){
        storage = new String[length];
        currentIndex = 0;
    }

    public void add(String item){
        if(storage[storage.length - 1] != null){
            throw new ArrayIndexOutOfBoundsException("Queue is full.");
        }

        storage[currentIndex] = item;
        currentIndex++;
    }

    public int size(){
        return currentIndex;
    }

    public String get(int index){
        return storage[index];
    }

    public void remove(){
        if(currentIndex == 0) throw new ArrayIndexOutOfBoundsException("Queue is empty");

        for (int i = 0; i < storage.length - 1; i++) {
            if(storage[i] == null) break;

            if(storage[i + 1] == null || i == storage.length - 1) {
                storage[i] = null;
                break;
            }

            storage[i] = storage[i + 1];
        }

        currentIndex--;
    }
}
