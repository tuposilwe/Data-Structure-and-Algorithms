package ASSIGNMENT_1;

import java.util.Scanner;

public class QN8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number to check is it is a prime: ");
        int number=input.nextInt();
        boolean isPrime=true;

        if(number<=1){
            isPrime=false;
        }
        else {
            for (int i=2;i<=Math.sqrt(number);i++){
                if(number% i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(number+" is a prime number");
        }
        else{
            System.out.println(number+ " is not a prime");
        }

    }
}
