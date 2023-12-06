package GROUP;
//A pizza restaurant charges Tsh10,000 for a small pizza and Tsh15,000 for a large pizza.
//        Write a program that asks the user to input the size of pizza they want and then outputs
//        the cost.

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of pizza: ");
        String p =sc.next();

        if(p.equalsIgnoreCase("small")){
            System.out.println("the cost is Tsh10,000");
        }  else if(p.equalsIgnoreCase("large")){
            System.out.println("the cost is Tsh10,000");
        }else {
            System.out.println("There is no such size");
        }

    }
}









