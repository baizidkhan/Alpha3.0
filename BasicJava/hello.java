package BasicJava;
import java.util.*;

public class hello {
    public static void main(String[] args) {
        System.out.println("Enter age number: ");
    Scanner sc = new Scanner(System.in);
    int Age = sc.nextInt();

        if(Age >= 18){
            System.out.println("Vote, Drive, Clg etc..");
        }
        else{
            System.out.println("Note Adult!!");
        }
    }
}