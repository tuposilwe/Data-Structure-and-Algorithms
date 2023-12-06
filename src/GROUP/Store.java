package GROUP;

//A store is having a sale where all items are 20% off. Write a program that takes the
//        original price of an item and outputs the discounted price.

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter original price: ");
        double price=sc.nextInt();
        double discounted =price- price*0.2;
        System.out.println("the discounted price is: "+discounted);

    }
}















