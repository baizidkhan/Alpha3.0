package Loop;

import java.util.*;
public class While {
    public static void main(String[] args) {
/*
//###################################################################
//    While Loop :

        int counter = 1;

        while (counter <= 3){
            System.out.println("Hello Bangladesh..");
            counter ++;
        }



//###################################################################
//    Print number from 1 to 9999 ::

        System.out.println("Print number from 1 to 9999 ::");
        int num = 1;

        while(num <= 9999){
            System.out.println(num);
            num ++;
        }





//###################################################################
//    Print number from 1 to n from user ::

        System.out.println("Enter the counter number :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;

        while(counter <= n){
            System.out.print(counter + " ");
            counter ++;
        }

 */


//####################################################################
//  Print sum of first N number ::

        System.out.println("Enter N number what you want :: ");
        Scanner sc = new Scanner(System.in);
        int n, sum, i;
        n = sc.nextInt();

        sum = 0;
        i = 1;

        while (i <= n){
            sum += i;
            i++;
        }

        System.out.println("Sum is : " + sum);




    }
}
