// i am going to write a program to input the marks of the five students and then calculate the grades
// percentage and average of each student

import java.util.Scanner;

public class Student{
    Scanner sc = new Scanner(System.in);
    int marks[] = new int[5];   

    // Constructor
    Student(){
        input();
    }

    // to input the marks 
    void input(){
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of student " + (i+1) + " : ");
            marks[i] = sc.nextInt();
        }
    }   
    
    // to calculate the total marks
    int total(){
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    // to calculate the average marks
    float average(){
        return (float)total() / marks.length;
    }

    // to calculate the percentage
    float percentage(){
        return (float)total() / marks.length;
    }

    // to calculate the grade
    char grade(){
        float avg = average();
        if(avg >= 90){
            return 'A';
        }
        else if(avg >= 80){
            return 'B';
        }
        else if(avg >= 70){
            return 'C';
        }
        else if(avg >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}