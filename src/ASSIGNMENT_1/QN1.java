package ASSIGNMENT_1;

import java.util.Scanner;

//write a program that calculates the volume and surface area of  a cube with side
public class QN1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the lenght of aside of a cube: ");
        double side=input.nextDouble();
        double volume=Math.pow(side,3);
        double surfacearea =6*Math.pow(side,2);
        System.out.println("the volume of a cube is:"+volume);
        System.out.println("the surface area of acube is:"+surfacearea);

    }
}
