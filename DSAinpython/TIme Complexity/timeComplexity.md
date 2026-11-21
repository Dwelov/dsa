# Time Complexity
it is represented by big O. there are six shapes of the big O.

Time Complexity does not depends upon the computer , processor , etc but on the number of the steps and the number of the inputs

#### 1. O(1) - constant time
#### 2. O(n) - linear time
#### 3. O(log n) - logarithmic time
#### 4. O(n log n) - linearithmic time
#### 5. O(n^2) - quadratic time
#### 6. O(n^3) - cubic time

## 1. Constant Time - O(1)
it does not depends upon the input
example - the time taken by a function to access the first element of an array or searching the elements by the index

## 2 - linear Time - O(n)
the steps grow with the number of the inputs 
for example if we have to find the maximum element in the array we have to traverse the entire array so the# time taken by the function is proportional to the number of the elements in the array 

## 3 - O (log n ) - logarithmic time 
usually used binary search algorithm , the number of the steps is proportional to the log of the n

## 4 - O(n log n ) - linearithmic time
usually used in sorting algorithms like merge sort , the number of the steps is proportional to the n times log of the n
the example is the recursive fibonacci series

## 5 - O (n^2) - quadratic time
the number of the steps depends upon the square of the number of the inputs 
example - nested loops 

## 6 - O (n^3) - cubic time
the number of the steps depends upon the cube of the number of the inputs 
example - matrix multiplication 

considering this order, the best algorithm  rating is from top to the bottom

When in the practice we follow the three steps 

## 1- Drop the Constants

a loop performing the two steps simple represents to the number of the steps, considering the bifg picture, the constant number of the steps is still a straight line 

## 2 - Keep the big part

suppose you are finding the sum of the first n numbers and the sum of the first n numbers squared, the time complexity will be O(n^2) because it grows faster than the sum of the first n numbers

## 3 - Drop non- dominate terms 

if we have O(n^2 + n), the time complexity will be O(n^2) because it grows faster than the sum of the first n numbers

All these rules are used to mesure the processing speed of the algorithm on the basis of the number of the inputs


