package ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayListOperations arrayListOperations = new ArrayListOperations(new ArrayList<>());       
        arrayListOperations.add(1);
        arrayListOperations.add(2);
        arrayListOperations.add(3);
        arrayListOperations.add(4);
        arrayListOperations.add(5);
        arrayListOperations.add(6);
        arrayListOperations.add(7);
        arrayListOperations.add(8);
        arrayListOperations.add(9);
        arrayListOperations.add(10);
        arrayListOperations.iterator();
        arrayListOperations.isEmpty();
        arrayListOperations.size();
        arrayListOperations.contains(5);
        arrayListOperations.remove(5);
        arrayListOperations.toArray();
        arrayListOperations.clear();
       
    }
    
}
