package BasicJava;

import java.util.*;
public class ConditionalStatement {
    public static void main(String[] args) {

       /*
**##################################################################***


        System.out.println("Enter age number :: ");

        Scanner sc = new Scanner (System.in);
        int Age = sc.nextInt();

        if(Age >= 18){
            System.out.println("Adult : Drive, Vote, Marriage etc..");
        }
        if(Age < 18 && Age >= 15){
            System.out.println("Teenager!!");
        }
        else{
            System.out.println("Not adult!!");
        }




//        **##################################################################**
//        Print the largest of 2

        Scanner sc = new Scanner (System.in);
        int A, B;
        System.out.println("Enter number A : ");
        A = sc.nextInt();
        System.out.println("Enter number B : ");
        B = sc.nextInt();

        if(A > B){
            System.out.println("A is greater then B!!");
        }
//        if(A == B){    **This statement output not working properly because of alternate answer showing..

        else if(A == B){
            System.out.println("A & B are equal!!");
        }
        else{
            System.out.println("B is greater then A!!");
        }







//        **##################################################################**
//        Print if a number is Odd or even ::

        System.out.println("Enter an integer number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0){   // We should take-care about serial of condition up-bottom
            System.out.println("Number is Zero!!");
        } else if (n%2 == 0) {
            System.out.println("Number is Even!!");
        } else {
            System.out.println("Number is Odd!!");
        }

        */


        //        **##################################################################**
//        Income Tax calculator ::

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income in number :: ");
        float Income = sc.nextFloat();

        if (Income <= 500000) {
            System.out.println("You have to Pay 0% tax.");
        } else if (Income > 500000 && Income < 1000000) {
            System.out.println("You have to Pay 20% tax.");
        } else if (Income >= 1000000){
            System.out.println("You have to Pay 30% tax.");
        }


    }
}

