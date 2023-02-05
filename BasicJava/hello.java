package BasicJava;
import java.util.*;

public class hello {
    public static void main(String[] args) {

        /*
        System.out.println("Enter an integer age number: ");
    Scanner sc = new Scanner(System.in);
    int Age = sc.nextInt();

        if(Age >= 18){
            System.out.println("Vote, Drive, Clg etc..");
        }
        else{
            System.out.println("Note Adult!!");
        }


         */


        int number = 70;
        String Bik = (number%2 == 0) ? "Even" : "Odd";
        System.out.println("The number is :: " + Bik);


    }
}
