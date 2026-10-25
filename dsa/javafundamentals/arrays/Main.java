package arrays;

public class Main {
    // practising the array operations from the array operations class
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        Arrayoperations arrayoperations = new Arrayoperations(arr);
        arrayoperations.traversal();
        arrayoperations.linearSearch(4);
        arrayoperations.binarySearch(5);
        arrayoperations.insertAt(arr, 4, 2, 6);
        arrayoperations.traversal();
        arrayoperations.deleteAt(arr, 4, 2);
        arrayoperations.traversal();
    }

}
