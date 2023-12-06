package ASSIGNMENT_1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int count=0;
        while (count<20){
            System.out.println("enter an even number: ");
            int number= input.nextInt();
            if(number%2==0){
                sum+=number;
                count++;
            }
        }
        System.out.println("the sum of the first 20 even number is: "+sum);
    }
}
