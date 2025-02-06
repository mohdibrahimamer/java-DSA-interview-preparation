package BasicsQuestions;

import java.util.Scanner;

public class FifthQuestion {
    public static void main(String[] args) {
//        question 6 in kunal assignment first java program
//        there is a mistake in this program formula is wrong

//        agar 0.11 aisa number use karna hai toh double  use karo

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your rupee");
        int rupee = input.nextInt();
        double dollar = 0.011;
        double result=  dollar * rupee;
        System.out.println("your converted rupee is $"+result);

//        mistake joh tum karey thae ismien
//        0.011 float variable istemal karye thae inplace of double
//        dollar / rupee karey thae





    }
}
