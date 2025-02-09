package BasicsQuestions;

import java.util.Scanner;


public class Question3 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

//  3 questioin in first  java proogram
//  write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        System.out.println("print principal amount");
        double Principal = input.nextInt();
        System.out.println("print time");
//       yaha per java ka khud ka package hai
        double time = input.nextInt();
        System.out.println("print rate");
        double rate = input.nextInt();


        double result =  (Principal * time * rate) /100;

        System.out.println("your interest rate result is" + result);

//        mistakes
        //         yaha per mistake multiply dale thae tum divide ki jagah
//        double used nai karey

    }

}
