package BasicsQuestions;

import java.util.Scanner;

public class question1 {
    public static void main (String[] args){
//        question 1 from first java assignment from kunal file
//        Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input =new Scanner(System.in);
        int num= input.nextInt();

        if (num%2 ==0 ){
            System.out.println("the number is even");
        }else {
            System.out.println("the number is odd");
        }



    }
}
