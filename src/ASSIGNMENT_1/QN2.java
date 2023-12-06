package ASSIGNMENT_1;
//write

import java.util.Scanner;

public class QN2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter a temperature in celsius:");
                double celsius  = input.nextDouble();
                double fahrenheit=(celsius*1.8)+32;
        System.out.println(celsius+" degrees Celsius is equal to"+fahrenheit+" degrees fahrenheit");
    }

}
