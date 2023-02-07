package BasicJava;

import java.util.*;
public class Practice {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weather :: ");
        float weather = sc.nextFloat();

        String temp = (weather >= 0) ? "Positive" : "Negative";

        System.out.println("Weather is ::" + temp);
    }
}
