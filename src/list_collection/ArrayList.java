package list_collection;

import java.util.Objects;

public class ArrayList implements List {
    protected int size;
    protected String[] element = new String[4];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean has(String item){
        for(String i : element) {
            if(i == item){
                return true;
            }
        }

        return false;
    }

    @Override
    public void add(String item) {
        if(element[element.length - 1] != null) {
            String[] tempArr = new String[element.length * 2];

            for (int i = 0; i < tempArr.length; i++) {
                for (int j = i; j < element.length; j++) {
                    tempArr[i] = element[j];
                    break;
                }
            }

            element = tempArr;
        }

        element[size] = item;
        size++;
    }

    @Override
    public void remove(String item) {
        String[] tempArray = new String[element.length];
        for (int i = 0; i < tempArray.length; i++) {
            for (String str : element) {
                if (!Objects.equals(str, item)) {
                    tempArray[i] = str;
                    i++;
                }
            }
        }
        element = tempArray;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return element[index];
    }

    public int capacity(){
        return element.length;
    }
}
