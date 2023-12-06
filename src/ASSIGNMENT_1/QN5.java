package ASSIGNMENT_1;

import java.util.Scanner;

//Write a program that calculates the sum of all even numbers between x and y.
public class QN5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x=sc.nextInt();
        System.out.print("Enter y: ");
        int y=sc.nextInt();
        int sum=0;
        for(int i=x;i<=y;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("the sum of even number between "+x+" and "+y+"is: "+sum);
    }
}
