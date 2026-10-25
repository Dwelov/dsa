package ArrayList;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListOperations {

    ArrayList<Integer> arrayList = new ArrayList<>();

    ArrayListOperations(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    /*
     * isEmpty() : Checks if the ArrayList is empty.
     * size() : Returns the number of elements in the ArrayList.
     * add(element) : Adds an element to the end of the ArrayList.
     * contains(element) : Checks if the ArrayList contains the specified element.
     * remove(element) : Removes the specified element from the ArrayList.
     * clear() : Removes all elements from the ArrayList.
     * toArray() : Converts the ArrayList to an array.
     * iterator() : Returns an iterator over the elements in the ArrayList.
     */

    void isEmpty() {
        System.out.println(arrayList.isEmpty());
    }

    void size() {
        System.out.println(arrayList.size());
    }

    void add(int element) {
        arrayList.add(element);
    }

    void contains(int element) {
        System.out.println(arrayList.contains(element));
    }

    void remove(int element) {
        arrayList.remove(element);
    }

    void clear() {
        arrayList.clear();
    }

    void toArray() {
        Object[] array = arrayList.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void iterator() {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

}
    