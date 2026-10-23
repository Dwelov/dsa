package arrays;

public class Arrays {
    // here i am practising all these core opertaions for an array, 
   // Find minimum, maximum, second largest, average, and duplicate elements in an array.

    
   // constructor
    Arrays(){

    }   

    // finding the max 

    void max(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is : " + max);
    }

    // finding the min 
    void min(int arr[]){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element is : " + min);
    }

    //finding the average of the array

    void average(int arr[]){
        int sum= 0; 
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Average element is : " + (float)sum / arr.length);
    }

    // finding the second largest

    void secondLargest(int arr[]){

        // explaining the implementation of this code snippet - for concept clarity, 
        // i am explaining a bit 
        // suppose arr = {1,2,3,4,5}
        // first largest = 1
        // first secondLargest = 1
        // i = 1 , arr[1] = 2 
        // 2 > 1 is true so second largest = 1 and largest = 2
        // i = 2 , arr[2] = 3
        // 3 > 2 is true so second largest = 2 and largest = 3
        // i = 3 , arr[3] = 4
        // 4 > 3 is true so second largest = 3 and largest = 4
        // i = 4 , arr[4] = 5
        // 5 > 4 is true so second largest = 4 and largest = 5
        // loop ends
        // print second largest = 4

        
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element is : " + secondLargest);
    }
    
    // finding the duplicate elements

    void duplicate(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate element is : " + arr[i]);
                }
            }
        }
    }
    
}
