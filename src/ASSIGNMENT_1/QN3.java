package ASSIGNMENT_1;

import java.util.Scanner;
/*Write a program that calculates the distance between two points on a Cartesian plane. The
points are (x, y) and (x, y).
*/
public class QN3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println( "enter the x-coordinate of Point 1: ");
        double x1=input.nextDouble();
        System.out.println( "enter the y-coordinate of Point 1: ");
        double y1=input.nextDouble();
        System.out.println( "enter the x-coordinate of Point 2: ");
        double x2=input.nextDouble();
        System.out.println( "enter the y-coordinate of Point 2: ");
        double y2=input.nextDouble();
        double distance =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("the distance between two point is: "+distance);
    }
}
