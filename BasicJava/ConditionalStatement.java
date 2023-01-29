package BasicJava;

import java.util.*;
public class ConditionalStatement {
    public static void main(String[] args) {
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
    }
}
