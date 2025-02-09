package BasicsQuestions;

import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
//        yaha per loops use karna hai
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number num1");
        double num1 = input.nextInt();
        System.out.println("please enter your 2nd number");
        int num2 =input.nextInt();


        double result = (num1 - 1) + (num1-2);
        System.out.println("your result is" + result);
    }
}
