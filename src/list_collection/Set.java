package list_collection;

public class Set {
    private ArrayList my_;

    public Set (){
        my_ = new ArrayList();
    }

    private Set(ArrayList arr){
        my_ = arr;
    }

    public void add(String item){
        if(my_.has(item)){
            return;
        }

        my_.add(item);
    }

    public void remove(String item){
        my_.remove(item);
    }

    public int size(){
        return my_.size();
    }

    public boolean has(String item){
        return my_.has(item);
    }

    private Set getAll(){
        Set toBeReturned =  new Set(my_);
        return toBeReturned;
    }
}