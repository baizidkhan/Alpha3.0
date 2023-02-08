package Loop;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
//        ##############################################

        System.out.println("Enter an integer number :: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 0;

        while(counter < num){
            System.out.println("Hello World");
            counter ++;

        }
        System.out.println("Print hello world " + num + " Time");
    }
}
