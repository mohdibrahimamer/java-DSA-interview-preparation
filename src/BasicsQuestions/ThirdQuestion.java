package BasicsQuestions;

import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
//        question no 5 in kunal first java assign file
//        Take 2 numbers as input and print the largest number.
        Scanner input =new Scanner(System.in);

        int num1= input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("the num1 is greater"+ num1);
        }

        if (num2 > num1){
            System.out.println("the num2 is greater" + num2);
        }

    }
}
