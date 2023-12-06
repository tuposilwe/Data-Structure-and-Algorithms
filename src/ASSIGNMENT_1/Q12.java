package ASSIGNMENT_1;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n =input.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println("the factorial of "+n+"is"+factorial);
    }
}
