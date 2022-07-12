package list_collection;

public class Stack {
    private String[] stack;
    private int size;
    private int pointer;

    public Stack(){
        stack = new String[4];
        size = 0;
        pointer = -1;
    }

    public int stackSize(){
        return size;
    }

    public void add(String item){
        if(stack[stack.length - 1] != null){
            String[] tempArr = new String[stack.length * 2];

            for (int i = 0; i < stack.length; i++) {
                tempArr[i] = stack[i];
            }

            stack = tempArr;
        }

        pointer++;
        stack[pointer] = item;
        size++;
    }

    public String peek(){
        if(size == 0){
            throw new RuntimeException("Stack currently doesn't have a member!");
        }

        return stack[pointer];
    }

    public void remove(){
        stack[pointer] = null;
        pointer--;
        size--;
    }

    public String pop(){
        remove();
        String lastElem = peek();
        return lastElem;
    }

    public int search(String item){
        for (int i = stack.length - 1; i >= 0; i--) {
            if(stack[i] == item) return i;
        }

        return -1;
    }

    public String get(int index){
        if (stack[index] != null) return stack[index];

        throw new RuntimeException("No element exist at that index");
    }
}
