package BasicJava;

import java.util.*;
public class VarData{
    public static void main(String[] args) {
        /*
        int A = 10;
        int B = 5;

        System.out.println("Addition is         = " + (A+B));
        System.out.println("Subtraction is      = " + (A-B));
        System.out.println("Multiplication is   = " + (A*B));
        System.out.println("Division is         = " + (A/B));
        System.out.println("Modulo is           = " + (A%B));

        int x = 20;
        int y = x++;

        System.out.println(x);
        System.out.println(y);

        int m = 20;
        int n = --m;

        System.out.println(m);
        System.out.println(n);
        */

//        int A = 10;
//        int B = 5;
//        int C = 10;
//
//        System.out.println(A != B);
//        System.out.println(A == C);

        int meal = 5;

        int tip = 2;

        int total = meal + (meal>6 ? ++tip : --tip);
    }
}