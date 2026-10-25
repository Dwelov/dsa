package arrays;

public class Arrayoperations {

    int[] array = new int[5];

    Arrayoperations(int array[]) {
        this.array = array;
    }

    // the first funtion is the traversal of the arrays
    void traversal() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    // linear search in arrys
    void linearSearch(int target) { 
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    // binary search requires sorted array
    void binarySearch(int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    // insertion --- array has fixed size, insertion of the element in the array ,
    // means shifing of all elements at right
    int insertAt(int arr[], int size, int index, int value) {

        if (arr.length == size) {
            throw new ArrayStoreException("Array is full");
        }

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;

        return size + 1;
    }

    // deletion of the specific element in the array , shift all elements at left
    // size will change- it is not the actual deletion 

    int deleteAt(int arr[], int size, int index) {
        
        if(index<0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for(int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }

        return size - 1;
    }

}