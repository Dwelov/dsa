import java.util.Scanner;

public class Numchecker{
    // the first thing asking  the user for the number to check whether it is  prime, armstrong even or odd

    Scanner sc = new Scanner(System.in);
    int num;

    // Constructor
    Numchecker(){
        input();
    }
    
    void input(){
        System.out.println("Enter a number : ");
        num = sc.nextInt();
    }
    
    void isPrime(){
        boolean isPrime = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
    
    void isArmstrong(){
        int originalNum = num;
        int sum = 0;
        while(num > 0){
            // for concept purpose , i am explaining a bit , 
            // suppose num = 153
            // 153 % 10 = 3 -> sum = 3 * 3 * 3 = 27
            // 153 / 10 = 15
            // 15 % 10 = 5 -> sum = 27 + 5 * 5 * 5 = 27 + 125 = 152
            // 15 / 10 = 1
            // 1 % 10 = 1 -> sum = 152 + 1 * 1 * 1 = 153
            // 1 / 10 = 0
            // so armstrong number is a number that is equal to the sum of the cubes of its digits
            

            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if(sum == originalNum){
            System.out.println(originalNum + " is an Armstrong number");
        }
        else{
            System.out.println(originalNum + " is not an Armstrong number");
        }
    }
    
    void isEvenOrOdd(){
        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        }
        else{
            System.out.println(num + " is an odd number");
        }
    }
    
    
    
}